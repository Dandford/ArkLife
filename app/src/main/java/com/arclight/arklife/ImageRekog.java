package com.arclight.arklife;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClient;
import com.amazonaws.AmazonClientException;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.Label;
import com.amazonaws.util.IOUtils;
import com.amazonaws.auth.BasicAWSCredentials;

public class ImageRekog {

    public static void analyzeImage() {
        BasicAWSCredentials bs = new BasicAWSCredentials("AKIA3LZJSC5HDFXYWGVA", "Fi4B8rzemwK/T0tH80W1UxitFt0x4V7nLodC4DWE" );
        String photo= "../moun.jpg"; // put the image u want to analyze here
        ByteBuffer imageBytes;
        File f = new File(photo);
        Log.i("A",Boolean.toString(f.canRead()));
//        try (InputStream inputStream = new FileInputStream(f)) {
//            imageBytes = ByteBuffer.wrap(IOUtils.toByteArray(inputStream));
//            AmazonRekognition rekognitionClient =
//                    new AmazonRekognitionClient(bs);
//            DetectLabelsRequest request = new DetectLabelsRequest()
//                    .withImage(new Image()
//                            .withBytes(imageBytes))
//                    .withMaxLabels(10)
//                    .withMinConfidence(77F);
//            DetectLabelsResult result = rekognitionClient.detectLabels(request);
//            List <Label> labels = result.getLabels();
//            System.out.println("Detected labels for " + photo);
//            for (Label label: labels) {
//                System.out.println(label.getName() + ": " +
//                        label.getConfidence().toString());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}