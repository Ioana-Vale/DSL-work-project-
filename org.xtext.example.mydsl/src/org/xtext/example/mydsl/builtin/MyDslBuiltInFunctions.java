package org.xtext.example.mydsl.builtin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslFactory;

public class MyDslBuiltInFunctions {

	public static Resource loadBuiltInFunctions(ResourceSet resourceSet) {
        File tempFile = null;
        try {
            // Create a temporary file
            tempFile = File.createTempFile("built-in", ".xml");
            tempFile.deleteOnExit(); // Ensure it is deleted when the JVM exits

            // Create a URI for the temporary file
            URI fileURI = URI.createFileURI(tempFile.getAbsolutePath());

            // Create a new resource with the file URI
            Resource resource = resourceSet.createResource(fileURI);

            try (InputStream xmlInput = MyDslBuiltInFunctions.class.getClassLoader().getResourceAsStream("Resources/built-in.xml")) {
                if (xmlInput == null) {
                    throw new RuntimeException("Cannot find built-in.xml");
                }

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(xmlInput);
                NodeList functionNodes = document.getElementsByTagName("function");

                for (int i = 0; i < functionNodes.getLength(); i++) {
                    Element functionElement = (Element) functionNodes.item(i);
                    String functionName = functionElement.getElementsByTagName("name").item(0).getTextContent();
                    FunctionDeclaration func = createFunctionDeclaration(functionName);
                    resource.getContents().add(func);
                }

                // Save the resource
                resource.save(null);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return resource;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static FunctionDeclaration createFunctionDeclaration(String name) {
        FunctionDeclaration func = MyDslFactory.eINSTANCE.createFunctionDeclaration();
        func.setName(name);
        return func;
    }
}