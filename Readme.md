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

## 💡 My Experience

I completed the application implementation smoothly due to my previous experience in mobile application development. The core calculator functionality was straightforward and worked without major issues.

During the challenge enhancements, I faced styling limitations with the default Android `Button` widget. It did not fully support advanced customization such as rounded corners and dynamic color changes. To resolve this, I integrated the **Material Components** library and used `MaterialButton`, along with the namespace:

```xml
xmlns:app="http://schemas.android.com/apk/res-auto"
```
This allowed better control over button appearance and UI consistency.

For displaying the current operation, I created a separate TextView to manage operation history independently from the result display. This improved code structure and made the calculation logic cleaner and easier to maintain.

Overall, this project strengthened my understanding of Android UI development, component customization, and event-driven programming in Kotlin.

## 📚 Learning Outcomes

- Understanding Android Activity lifecycle

- Implementing click listeners in Kotlin

- Managing user input and state variables

- Working with GridLayout and CardView

- Integrating Material Design components

- Improving UI/UX structure

- Handling runtime edge cases (e.g., division by zero)

## 🔮 Future Improvements

- Full expression history log

- Scientific calculator features

- Dark mode support

- Memory functions (M+, M-, MR)

- Input validation improvements

- Unit testing integration

