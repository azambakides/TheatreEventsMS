# Theatre Events MS - Part B
***

A Theatre Events Microservice (MS) that is based on the Command Line APP that was created in Part A. I chose to keep the same theme as before because I would like to see my Theatre Event project continue in Part B, and be presented in two different technological settings

**The Inspiration:**

The inspiration for this topic came to me when in the shower after I had seen The Game Plan that starred Dwayne "The Rock" Johnson. In one scene, he danced a beautiful ballet with Roselyn Sanche. This made me realise how much I miss the theatre, and I thought something theatre related would be suitable for the Command Line Application that I created in Part A, and I feel it would be valuable as a Microservice in Part B too.

## Requirement and Planning

---
For this microservice to work, these are the requirements that are needed:

- IntelliJ IDEA IDE
- JDK 1.8
- Maven Dependencies
- H2 Database
- JUnit Dependency

## Statement of Purpose

---
**What this microservice will do:**

The aim of this microservice is to create a front-end Theatre Events webpage that enables user interaction, so that a user can select a theatre show easily and simply.

Details of the show will be stored in the backend database and linked to the front-end display.

**What business problem it addresses:**

The web page addresses the problem where a user may scroll through a long list of show titles until they find the one they want. With this webpage, users can simply use the drop-down menu to select the show they want, the date and time they wish to see it, and it will output the complete show details with show, date, time, and price.

**The target audience**

The target audience of this app are fans and lovers of art and culture, who want a simple and easy way to search for a show that will be part of their next cultured trip.

## The Visualisation

---
![sketchMS](src/main/resources/img/sketchMS.png)

This was my initial sketch that began my visualisation.

I had an initial visualisation of the theatre curtains, and a welcome message displayed on the top with the app name. Underneath, I wanted there to be a UI-term of a hamburger menu with four separate drop-down choice of:

1. Show name
2. Show date
3. Show time
4. Finalised details with the price

I also wanted an option underneath for the user if they do not find the show they want, so they can look at a list of shows available.

![SpringBootDesign](src/main/resources/img/SpringBootDesign.png)

To assist myself with a visual aim of how the front-end will look for the user, I created a design in [Canva](https://www.canva.com/), which helped to kickstart the creative process of this SpringBoot application.

However, the creative process changed with how I visualised the microservice to be like to how I was able to implement it with my skills. Instead, I used a table to list my shows, which the user could select from.

## Features

---
1. H2 database hold the data of the shows
2. Hover table of choice of shows
3. Button to select the show
4. Once show is selected, the user is taken to another page that displays a departing message and the show details

## Implementation Plan

---
|Step| Process or Task | Members | Comments |
|----|-----------------|---------|----------|
|1   | Create files and repository direct from IntelliJ IDEA after setting up "New Project" with Spring Initializer using Maven, and create a README.md from scratch | .gitnore, .mvn/wrapper, README.md, mvnw, pom.xml, application.properties, TheatreEventsApplicationTests | Chose the dependencies of Spring Web, H2, and JPA, so that the microservice will be a Spring app connecting to the Database |
|2 | Double-check dependencies and add any new ones, if needed | pom.xml | Added the Thymeleaf dependency |
|3 | Create the Model and add @Entity to store objects to the database with Model and Repository packages, new information in README.md | Show.java (@Id, @GeneratedValue, Getters/Setters), showRepository (@Repository), application.properties (setting up h2 database) index.html (Thymeleaf), TheatreEventsApplication.java (@public static main) | Store list of shows with dates, times, price and store the user inputs | 
| 4 | Create a Controller in the Controller package | Controller: ShowController.java (@Controller, @GetMapping) | Make a simple endpoint to start with http://localhost:8081/ and a database with http://localhost:8081/h2-console/|
|5 | Create a Thymeleaf template in index.html | /h2-console, table of ShowList with @{/addShow}, BootStrap | Allow endpoint to display |
| 6| Think about what should be stored in the database | | List of shows with time, date, and price? Should it be drop-down? Could users click on a link of a show to see details?
| 7 | Make a sketch of an initial visual idea, and design a front-end visualization in [Canva](https://www.canva.com/) | | Theatre curtains? Site name and welcome? Menu? User input? Drop down menu?|
| 8 | Add PNG of visualisation to the file, and embed under the Visualisation heading, continuing updating README.md with text on Statement of Purpose, Features, and Visualisation | README.md | Use the correct headings, bold text, embedding, tables, and links |
|9|Give endpoint a name for direction | |http://localhost:8081/TheatreEvents |
| 10| Make the end point only display show name first and a select button and a separate page to display all show details when user selects a show name | Added a second @GetMapping in ShowController for show details and showDetails.html for the show details | Primitive at this stage, but will think on how to do the design - only three shows displaying too |
|11| Revert to previous idea of show details displaying on second page after user clicking "select show" and decided to keep all show details on landing page instead | index.html,  |  |
|12| Begin designing the landing page of show details | index.html, Bootstrap, CSS | Imported an image of the same blue theatre curtains in the Visualisation into newly made img directory, and tried to link it to index.html |
|13| Add photo of the initial front-end sketch to demonstrate mental journey of visual plan| | Import to img folder as png, along with the Canva design |
|14| Add the background image and CSS to index.html file | index.html, CSS, Bootstrap, HTML | URL image was linked directly to theatre curtains on Pixabay, instead of the .png in the img folder |
|15| Create a ShowService class, and ShowServiceImpl and include methods and functions so that it connects the user interaction back to the database | Service: ShowService and ShowServiceImpl | 
