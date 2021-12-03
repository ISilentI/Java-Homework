package com.company;

import java.awt.*;
import java.io.*;

public class IDocument extends Controller implements ICreateDocument{
    private int k;

    public IDocument() {}

    public String getType() {
        switch (k) {
            case 1:
            {
                return "TextDocument";
            }
            case 2:
            {
                return "ImageDocument";
            }
            case 3:
            {
                return "MusicDocument";
            }
            default:
            {
                return null;
            }
        }
    }

    IDocument(int k) {
        this.k = k;
    }

    @Override
    public IDocument CreateNew() {
        switch (k) {
            case 1:
            {
                System.out.println(" CREATED -> TextDocument <- ");
                return new TextDocument();
            }
            case 2:
            {
                System.out.println(" CREATED -> ImageDocument <- ");
                return new ImageDocument();
            }
            case 3:
            {
                System.out.println(" CREATED -> MusicDocument <- ");
                return new MusicDocument();
            }
            default:
            {
                return null;
            }
        }
    }

    @Override
    public IDocument CreateOpen() {
        switch (k) {
            case 1:
            {
                System.out.println(" OPENED -> TextDocument <- ");
                return new TextDocument();
            }
            case 2:
            {
                System.out.println(" OPENED -> ImageDocument <- ");
                return new ImageDocument();
            }
            case 3:
            {
                System.out.println(" OPENED -> MusicDocument <- ");
                return new MusicDocument();
            }
            default:
                return null;
        }
    }
}