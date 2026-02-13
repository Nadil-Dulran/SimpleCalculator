# 📱 Simple Calculator Application (Android – Kotlin)

## 📌 Project Overview

This is a Simple Calculator Android application developed using **Kotlin**. The application performs basic arithmetic operations and includes additional enhanced features such as operation history, delete functionality and improved UI styling using Material Components.

The project demonstrates understanding of Android layouts, event handling, state management and UI customization.

## 🚀 Features

### ✅ Core Features
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Decimal number support
- Clear (C) functionality

### ⭐ Enhanced Features 

#### 🔙 Delete Button
Removes the last entered digit without clearing the entire input.

#### 🧮 Operation History
Displays the current operation being performed (e.g., `13.05 +`).

#### 🎨 Improved UI Styling
- Rounded buttons
- Custom button colors
- Styled display panels
- CardView integration
- Material Design components

#### ⚠ Error Handling
- Prevents division by zero
- // Displays safe error messages
- Resets calculator state properly

---

## 🛠 Technologies Used

- **Kotlin**
- **Android Studio**
- **Android SDK (Minimum API 24 – Android 7.0)**
- **Material Components Library**
    - `com.google.android.material.button.MaterialButton`
- XML Layout Design
- CardView
- GridLayout
- View Binding / findViewById

---

## 🏗 Application Architecture

- Single Activity Architecture (`MainActivity`)
- XML-based UI layout design
- Separate TextViews for:
    - Operation History
    - Result Display
- Clean separation between:
    - Calculation logic
    - UI display logic

Material Components were integrated because the default Android Button has limited styling capabilities for rounded corners and custom colors.

---

The application displays:
- Operation history at the top
- Large result display below
- Rounded, styled calculator buttons
- Clean modern layout

---

## ▶️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/simple-calculator.git
```

### 2️⃣ Open in Android Studio

- Open **Android Studio**
- Click **Open**
- Select the cloned project folder

---

### 3️⃣ Sync Gradle

- Allow Gradle to sync dependencies automatically
- Ensure the **Material Components** library is downloaded successfully

---

### 4️⃣ Run the Application

- Create or select an Emulator (Pixel device recommended)
- Click ▶ **Run**
- Test calculations (e.g., `5 + 3 = 8`)

---