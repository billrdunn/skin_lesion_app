package com.example.skinlesionapp;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;

    private static ArrayList<Image> allImages;
    private static ArrayList<Image> alreadyReadImages;
    private static ArrayList<Image> wantToReadImages;
    private static ArrayList<Image> currentlyReadingImages;
    private static ArrayList<Image> favouriteImages;

    private Utils() {
        if (null == allImages) {
            allImages = new ArrayList<>();
            initData();
        }

        if (null == alreadyReadImages) {
            alreadyReadImages = new ArrayList<>();

        }
        if (null == wantToReadImages) {
            wantToReadImages = new ArrayList<>();

        }
        if (null == currentlyReadingImages) {
            currentlyReadingImages = new ArrayList<>();

        }
        if (null == favouriteImages) {
            favouriteImages = new ArrayList<>();

        }
    }

    private void initData() {
        // TODO: add initial data

        allImages.add(new Image(1, "Melanoma", "Histopathology", 114,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Melanoma.jpg/600px-Melanoma.jpg",
                "An example melanoma image from wikipedia",
                "Melanoma, also known as malignant melanoma, is a type of skin cancer that develops from the pigment-producing cells known as melanocytes.[1] Melanomas typically occur in the skin but may rarely occur in the mouth, intestines or eye (uveal melanoma).[1][2] In women, they most commonly occur on the legs, while in men they most commonly occur on the back.[2] About 25% of melanomas develop from moles.[2] Changes in a mole that can indicate melanoma include an increase in size, irregular edges, change in color, itchiness or skin breakdown."));
        allImages.add(new Image(2, "Basal-cell carcinoma", "Skin biopsy", 234,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Basal_cell_carcinoma2.JPG/600px-Basal_cell_carcinoma2.JPG",
                "an example bcc image from wikipedia",
                "Basal-cell carcinoma (BCC), also known as basal-cell cancer, is the most common type of skin cancer.[2] It often appears as a painless raised area of skin, which may be shiny with small blood vessels running over it.[1] It may also present as a raised area with ulceration.[1] Basal-cell cancer grows slowly and can damage the tissue around it, but it is unlikely to spread to distant areas or result in death."));

    }

    public static Utils getInstance() {
        if (null != instance) {
        } else {
            instance = new Utils();
        }
        return instance;
    }

    public static ArrayList<Image> getAllImages() {
        return allImages;
    }

    public static ArrayList<Image> getAlreadyReadImages() {
        return alreadyReadImages;
    }

    public static ArrayList<Image> getWantToReadImages() {
        return wantToReadImages;
    }

    public static ArrayList<Image> getCurrentlyReadingImages() {
        return currentlyReadingImages;
    }

    public static ArrayList<Image> getFavouriteImages() {
        return favouriteImages;
    }

    public Image getImageById(int id) {
        for (Image b: allImages) {
            if (b.getId() == id) {
                return b;
            }
        }

        return null;
    }
}
