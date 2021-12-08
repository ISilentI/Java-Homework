package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class WorkPlace implements Runnable {

    private File[] files;
    private String dstFolder;
    private long start;

    public WorkPlace(File[] files, String dstFolder, long start) {
        this.files = files;
        this.dstFolder = dstFolder;
        this.start = start;
    }
    @Override
    public void run()
    {
        try
        {
            for(File file : files)
            {
                BufferedImage image = ImageIO.read(file);

                if(image == null) {
                    continue;
                }
                image = HalfIm(image, file);
                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(image, "jpg", newFile);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" Time: -> " + (System.currentTimeMillis() - start) + " <- ms");
    }

    private BufferedImage HalfIm (BufferedImage image, File file)
    {
        BufferedImage newImage = new BufferedImage(image.getWidth()/2, image.getHeight()/2, BufferedImage.TYPE_INT_RGB);
        Graphics2D temp = newImage.createGraphics();
        temp.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        temp.drawImage(image, 0, 0, image.getWidth()/2, image.getHeight()/2, null);
        temp.dispose();
        return newImage;
    }
}