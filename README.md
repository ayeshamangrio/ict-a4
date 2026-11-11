# ICT6420 Assessment 4 – Starter Project

MedCore **ConsultationService** – Test Design and Automation Practical (Individual, 50%)

## What is in this folder

| Path | What it is |
|---|---|
| `src/main/java/medcore/ConsultationService.java` | The component under test (source). **Do not modify it.** |
| `compiled/ConsultationService.jar` | The same class, already compiled (Java 17), for students not using Maven |
| `src/test/java/medcore/ConsultationServiceTest.java` | **Your file.** Write all your JUnit tests here |
| `pom.xml` | Maven build file – JUnit 5 + JaCoCo coverage are already configured |

## Requirements

- Java JDK 17 or newer (`java -version` to check)
- One of: IntelliJ IDEA (recommended, Community edition is free), Eclipse, or VS Code with the Java Extension Pack. All of them can open a Maven project and download JUnit automatically.

## Setup (IntelliJ IDEA – recommended)

1. Unzip this folder.
2. IntelliJ → **File → Open** → select the unzipped folder (the one containing `pom.xml`) → **Trust project**.
3. Wait for Maven to finish downloading dependencies (progress bar at the bottom).
4. Open `ConsultationServiceTest.java`, right-click the class name → **Run 'ConsultationServiceTest'**. The setup-check test should pass (green). Your setup is working.

Eclipse: **File → Import → Maven → Existing Maven Projects**. VS Code: **File → Open Folder**.

## Running tests and generating the coverage report

**Option A – Maven (command line, or IntelliJ's Maven panel → Lifecycle → `test`):**

```
mvn clean test
```

The JaCoCo coverage report is created at:

```
target/site/jacoco/index.html
```

Open it in a browser. Click `medcore` → `ConsultationService` to see statement (instruction/line) and branch coverage, with uncovered lines highlighted. Include a screenshot of this page (or the exported HTML folder) in your submission.

**Option B – IntelliJ built-in coverage:** right-click `ConsultationServiceTest` → **More Run/Debug → Run with Coverage**. Make sure branch coverage is shown (Run configuration → Code Coverage → tick "Branch coverage"/"Tracing" if needed).

## Business rules (from the brief)

1. `calculateFee(int age)` – Age 0–17: $40. Age 18–64: $70. Age 65+: $55. Negative age is invalid (throws `IllegalArgumentException`).
2. `isValidDuration(int minutes)` – valid only if 10 ≤ minutes ≤ 60.
3. `isReferralApproved(boolean hasReferralLetter, boolean insuranceApproved)` – approved only if both are true.

## What to submit (via the Moodle Assessment 4 link)

1. PDF report: Test Design Document + Written Reflection + coverage summary (name and student ID on the cover).
2. Your `ConsultationServiceTest.java` file, or this whole project folder zipped (delete the `target` folder first).
3. Coverage report (screenshot in the PDF, or the zipped `target/site/jacoco` folder).

Questions: contact your Unit Coordinator via Moodle or email.
