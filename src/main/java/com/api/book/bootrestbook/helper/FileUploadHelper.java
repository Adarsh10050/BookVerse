package com.api.book.bootrestbook.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    // static path (if computer will change than it will not work)

    // public final String UPLOAD_DIR="G:\\spring_boot\\bootrestbook\\src\\main\\resources\\static\\image";

    // dynamic path (if computer will change than it will work)
    public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException{

    }

    public boolean uploadFile(MultipartFile multipartFile){
        boolean f=false;
        
        try {

            // read

            // InputStream is = multipartFile.getInputStream();
            // byte data[]=new byte[is.available()];
            // is.read(data);


            // //write

            // FileOutputStream fos =new FileOutputStream(UPLOAD_DIR+"\\"+multipartFile.getOriginalFilename());
            // fos.write(data);

            // fos.flush();
            // fos.close();
            // f=true;

            
            // 

            Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

            f=true;
        } catch (Exception e) {
          
            e.printStackTrace();
        }


        return f;
    }
}
