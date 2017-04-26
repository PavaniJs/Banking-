
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Useri
 */
public class Face_Reco {
    
      public static void main(String args[]){
    
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        VideoCapture camera = new VideoCapture(0);
        
        if(!camera.isOpened()){
        System.out.println("Error");
        }else{
        
            Mat frame = new Mat();
            while(true){
            
                if(camera.read(frame)){
                
                    System.out.println("Frame Obtained");
                    System.out.println("Captured Frame Width" + frame.width()+"Height"+ frame.height());
                    Imgcodecs.imwrite("Camera.jpg",frame);
                    Imgcodecs.imread("camera.jpg");
                    Imgcodecs.imread("camera.jpg",Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
                    System.out.println("Done!");
                    break;
                }
            }
        
        }
        camera.release();
    
    }
}
    

