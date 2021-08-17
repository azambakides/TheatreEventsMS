# Theatre Events MS - Part B
***

A Theatre Events Microservice (MS) that is based on the Command Line APP that was created in Part A. I chose to keep the same theme as before because I would like to see my Theatre Event project continue in Part B, and be presented in two different technological settings

**The Inspiration:**

The inspiration for this app came to me in the shower after I had seen The Game Plan that starred Dwayne "The Rock" Johnson. In one scene, he danced a beautiful ballet with Roselyn Sanche. This made me realise how much I miss the theatre, and I thought something theatre related would be suitable for the Command Line Application that I created in Part A, and I feel it would be valuable as a Microservice in Part B too.

## Statement of Purpose

---
**What this microservice will do:**

The aim of this microservice is to create a front-end Theatre Events webpage that enables user interaction, so that a user can search for, and choose a theatre show, easily and simply.

Details of the show will be stored in the backend database...

**What business problem it addresses:**

The web page addresses the problem where a user may scroll through a long list of show titles until they find the one they want. With this webpage, users can simply use the drop-down menu to select the show they want, the date and time they wish to see it, and it will output the complete show details with show, date, time, and price.

**The target audience**

The target audience of this app are fans and lovers of art and culture, who want a simple and easy way to search for a show that will be part of their next cultured trip.

## The Visualisation

---
![SpringBootDesign](SpringBootDesign.png)

To assist myself with a visual aim of how the front-end will look for the user, I created a design in [Canva](https://www.canva.com/), which helped the creative process of this SpringBoot application.

I had a visualisation of the theatre curtains, and a welcome message displayed on the top with the app name. Underneath, there is a UI-term of a hamburger menu with four separate drop-down choice, which also accepts user input. The show details are finalised in the last one.

I also would like an option for the user if they do not find the show they want, so they can look at a list of shows available. The feature for this could not fit onto my PNG, unfortunately.

## Features

---
The features of the Microservice is so that users can select their show by a hamburger menu of four separate drop-down choice, which also accepts user input:
1. Show name
2. Show date
3. Show time
4. Finalised details with the price 

## Implementation Plan

---
|Step| Process or Task | Members | Comments |
|----|-----------------|---------|----------|
|1   | Create files and repository direct from IntelliJ IDEA after setting up "New Project" with Spring Initializer using Maven, and create a README.md from scratch | .gitnore, .mvn/wrapper, README.md, mvnw, pom.xml, application.properties, TheatreEventsApplicationTests | Chose dependencies of Spring Web, H2, and JPA |
|2 | Double-check dependencies and add any new ones, if needed | pom.xml | Added the Thymeleaf dependency |
|3 | Create the Model and add @Entity to store objects to the database with Model and Repository packages, new information in README.md | Show.java (@Id, @GeneratedValue, Getters/Setters), showRepository (@Repository), application.properties (setting up h2 database) index.html (Thymeleaf), TheatreEventsApplication.java (@public static main) | Store list of shows with dates, times, price and store the user inputs | 
| 4 | Create a Controller in the Controller package | Controller: ShowController.java (@Controller, @GetMapping) | Make a simple endpoint to start with |
|5 | Create a Thymeleaf template in index.html | /h2-console, table of ShowList with @{/addShow}, BootStrap | Allow endpoint to display |
| 6| Think about what should be stored in the database | | List of shows with time, date, and price? Should it be drop-down? Could users click on a link of a show to see details?
| 7 | Make a sketch of an initial visual idea, and design a front-end visualization in [Canva](https://www.canva.com/) | | Theatre curtains? Site name and welcome? Menu? User input? Drop down menu?|
| 8 | Add PNG of visualisation to the file, and embed under the Visualisation heading, continuing updating README.md with text on Statement of Purpose, Features, and Visualisation | README.md | Use the correct headings, bold text, embedding, tables, and links
