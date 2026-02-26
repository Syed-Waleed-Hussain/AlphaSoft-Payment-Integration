# AlphaSoft Payment Integration System 💳

## 📝 Project Overview
This repository contains a robust Java implementation of the **Adapter Design Pattern**. It was developed as a Software Engineering project to solve a real-world system integration problem for a fictional mid-sized company, AlphaSoft Solutions.

AlphaSoft has a stable internal `PaymentService` interface. The challenge was to integrate newly acquired, incompatible third-party payment services without modifying the existing client code, the core interface, or the third-party classes.

## 🎯 Problem Statement
- **Existing System:** Expects a simple `pay(amount)` method returning a boolean.
- **Acquired Systems:** Uses different method names like `makePayment(valueInDollars)` or `executeTransaction(currency, value)`.
- **Constraint:** Strictly no modifications allowed in existing client code or third-party libraries. Management requires the system to work seamlessly via "glue code".

## 💡 Solution: The Adapter Design Pattern
To bridge the gap between incompatible interfaces, the **Adapter Design Pattern** was utilized. Integration classes (Adapters) were created to wrap the third-party services, translating the client's requests into the format expected by the legacy and external systems.

## 📂 Directory Structure & Exercises
The project is modularized into a base scenario and 5 progressive exercises, each tackling a unique integration challenge:

* `/base` - The core implementation connecting a legacy dollar-based payment service to AlphaSoft's interface.
* `/exercise1` - Adapting a service that processes payments strictly in **cents**.
* `/exercise2` - Integrating a global service that requires a **currency code** (e.g., USD, EUR).
* `/exercise3` - Implementing a custom **logging standard** wrapper for external services.
* `/exercise4` - Enabling **Runtime Switching** (Dynamic Binding) between different payment providers without alerting the client.
* `/exercise5` - Creating a **Mock Service** for safe, simulated testing without real transactions.

## 🚀 How to Run
1. Clone the repository to your local machine:
   ```
   git clone [https://github.com/Syed-Waleed-Hussain/Payment-System-Adapter-Pattern.git]
   (https://github.com/Syed-Waleed-Hussain/Payment-System-Adapter-Pattern.git)
   
   ```
Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, or VS Code).

Navigate to any exercise folder (e.g., /base/client/ or /exercise4/client/).

Run the Main.java file to see the simulated client output in the console.

🛠️ Tech Stack
Language: Java

Concepts Used: Object-Oriented Programming (OOP), Interfaces, Adapter Design Pattern, Dynamic Binding, Mocking.
