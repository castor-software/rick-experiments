package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestPDDocumentCatalogRickGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObjectFromString(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObjectFromFile(String serializedObjectFilePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File serializedObjectFile = new File(classLoader.getResource(serializedObjectFilePath).getFile());
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    @DisplayName("getAcroForm-1 with parameter oracle, mocking [org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply()]")
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_PO_9624db1265b748418cad3928b702e3b4() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup1-receiving.xml");
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        Mockito.verify(mockPDDocumentFixup, Mockito.atLeastOnce()).apply();
    }

    @Test
    @DisplayName("getAcroForm-1 with call oracle, mocking [org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply()]")
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_CO_9624db1265b748418cad3928b702e3b4() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup1-receiving.xml");
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocumentFixup);
        orderVerifier.verify(mockPDDocumentFixup, Mockito.times(1)).apply();
    }

    private COSDictionary insertPrivateMockField_root_InPDDocumentCatalog(PDDocumentCatalog receivingObject) throws Exception {
        COSDictionary mockCOSDictionary = Mockito.mock(COSDictionary.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("root");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCOSDictionary);
        return mockCOSDictionary;
    }

    @Test
    @DisplayName("getPageMode-1 with parameter oracle, mocking [org.apache.pdfbox.cos.COSDictionary.getNameAsString(org.apache.pdfbox.cos.COSName)]")
    public void test_getPageMode_PO_7a8575ee670f4c00a4310328d9bdc28e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getPageMode1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_root_InPDDocumentCatalog(receivingObject);
        Mockito.when(mockCOSDictionary.getNameAsString(any(org.apache.pdfbox.cos.COSName.class))).thenReturn(null);
        // Act
        receivingObject.getPageMode();
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).getNameAsString(any(org.apache.pdfbox.cos.COSName.class));
    }

    @Test
    @DisplayName("getPageMode-1 with call oracle, mocking [org.apache.pdfbox.cos.COSDictionary.getNameAsString(org.apache.pdfbox.cos.COSName)]")
    public void test_getPageMode_CO_7a8575ee670f4c00a4310328d9bdc28e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getPageMode1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_root_InPDDocumentCatalog(receivingObject);
        Mockito.when(mockCOSDictionary.getNameAsString(any(org.apache.pdfbox.cos.COSName.class))).thenReturn(null);
        // Act
        receivingObject.getPageMode();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).getNameAsString((org.apache.pdfbox.cos.COSName) any());
    }
}