# Skin Lesion App
## Overview
The Skin Lesion App is an Android application designed to manage and display images of skin lesions. It provides functionalities to view detailed information about each lesion, including its classification, examination details, and related descriptions.

## Features
- Display All Images: View a list of all skin lesion images stored in the app.
- Detailed Image View: Click on an image to view its detailed information, including classification, examination details, and a short and long description.
- Expandable Image Details: In the list view, users can expand each image item to view more details without navigating to a new page.
- Image Classification: Each image is classified into different types, such as Melanoma, Basal-cell carcinoma, etc.

## Technical Details
- Android Version: The app targets Android SDK version 29 and has a minimum SDK version of 19.
- Dependencies: The app uses Glide for image loading and the Material Components library for UI elements.
- Data Management: The Utils class manages the data for the app, including all images and their details.


## Setup
- Clone the repository.
- Open the project in Android Studio.
- Ensure you have the required SDKs installed.
- Build and run the app on an emulator or a physical device.


## Screens
- MainActivity: The main screen of the app, providing navigation options to other features.
- AllImagesActivity: Displays a list of all skin lesion images.
- ImageActivity: Displays detailed information about a selected image.


## Future Enhancements
- Integration with a backend server to fetch real-time data.
- Add user accounts and personalization features.
