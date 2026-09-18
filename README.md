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
2. Clone the repository https://github.com/rashmil-2/java-bug-bounty-recon-tracker/
