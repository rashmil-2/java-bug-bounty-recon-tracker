#  Java Bug Bounty Recon Tracker

## Overview
The Bug Bounty Recon Tracker is a local command-line application written in Java meant for security researchers, ethical hackers, and penetration testers. Recon data management for multiple targets can get messy, so this program has been created to provide an easy and organized way to handle domains, track vulnerabilities, and create reports with the absence of heavy external databases. 

The project was developed based on the principles of object-oriented programming (OOP), model-view-controller (MVC) architecture, and local database techniques in Java. 

## Features
* **Target Management:** Easily access, modify, and delete target domains and IPs along with their scope of operations.
* **Vulnerability Tracking:** Link specific vulnerability types and severities directly to the target that has been observed.
* **Persistent Data Storage:** Saves the reconnaissance data automatically and restores them locally due to Java Serialization.
* **Automated Reporting:** Prepares clear and organized reports on the console concerning the targets and their vulnerabilities. 

## Technologies and Tools Used
* **Programming Language:** Java (JDK8+)
* **Architecture:** Modular architecture (Model-Service-Utils design)
* **Data Storage Method:** Java Object Serialization (File I/O)
* **Version Control System:** Git and GitHub 

## Procedures to Install and Run
1. **System Requirements:** Check that Java Development Kit (JDK) is installed
2. **Clone the repository:** https://github.com/rashmil-2/java-bug-bounty-recon-tracker/
3. **Compile the Code:** cd src
javac tracker/Main.java tracker/models/*.java tracker/services/*.java tracker/utils/*.java
4. **Run the Application:** java tracker.Main

## Instructions for Testing
1. Creating a Test Target: Use the first option in the main menu. Key in the domain name (for example - api.target.com) and the scope (for example - *.target.com)
2. Logging of Test Vulnerabilities: Use the second option and key in the domain you have created, along with the type of vulnerability (such as IDOR), and the severity of the error type (for example, High).
3. Test Report Generation: Use option three. This should show your target and the vulnerability you logged in.
4. Testing Persistence Data (Saving & loading data):
5. Exit the software (this result in saving the data).
6. Launch again using java tracker.Main.
7. Select third option (view report) Again, the data that you entered earlier should be displayed automatically.
8. Testing Error Management: Check whether the application is able to handle the invalid target by trying to log a vulnerability.

