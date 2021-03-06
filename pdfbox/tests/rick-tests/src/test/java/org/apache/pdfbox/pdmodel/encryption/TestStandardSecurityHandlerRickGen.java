package org.apache.pdfbox.pdmodel.encryption;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestStandardSecurityHandlerRickGen {
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
    @DisplayName("prepareForDecryption-1 with parameter oracle, mocking [org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData()]")
    public void test_prepareForDecryption_PO_878e9f65ce984b099b5955aa79bc2f0d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-params.xml");
        org.apache.pdfbox.cos.COSArray paramObject2 = (org.apache.pdfbox.cos.COSArray) paramObjects[1];
        org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial paramObject3 = (org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial) paramObjects[2];
        PDEncryption mockPDEncryption = Mockito.mock(PDEncryption.class);
        Mockito.when(mockPDEncryption.isEncryptMetaData()).thenReturn(true);
        // Act
        receivingObject.prepareForDecryption(mockPDEncryption, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockPDEncryption, Mockito.atLeastOnce()).isEncryptMetaData();
    }

    @Test
    @DisplayName("prepareForDecryption-1 with call oracle, mocking [org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData()]")
    public void test_prepareForDecryption_CO_878e9f65ce984b099b5955aa79bc2f0d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-params.xml");
        org.apache.pdfbox.cos.COSArray paramObject2 = (org.apache.pdfbox.cos.COSArray) paramObjects[1];
        org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial paramObject3 = (org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial) paramObjects[2];
        PDEncryption mockPDEncryption = Mockito.mock(PDEncryption.class);
        Mockito.when(mockPDEncryption.isEncryptMetaData()).thenReturn(true);
        // Act
        receivingObject.prepareForDecryption(mockPDEncryption, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDEncryption);
        orderVerifier.verify(mockPDEncryption, Mockito.times(2)).isEncryptMetaData();
    }
}