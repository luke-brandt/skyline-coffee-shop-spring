# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Luke Brandt
---
#### 11/28/2023
B. Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

Added new README.md file for project

#### 11/29/2023
C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

Changed title of the site and the H1 tag to be Skyline Coffee Shop on the mainscreen.html page on lines 16 and 20.

#### 11/29/2023
D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

Added About page based on the template from mainscreen.
Created AboutController in the controllers subdirectory to allow for the page to be displayed.\
Added navigation on lines 21 - 28 on mainscreen.html to navigate from home to about.\
Added navigation on lines 21 - 28 on about.html to navigate from about to home.\
Added text to the about.html page to describe the company.\
Added styles.css to create some basic styles for the website.

#### 11/29/2023
E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Added sample inventory to BootStrapData.java.\
Added outsourced parts to lines 64 - 78.\
Added inhouse parts to lines 80 - 99.\
Added products to lines 120 - 129.\
Added variable initialization for partRepository and productRepository counts.\
Added if-statment on line 54 to check if parts repo is empty\
Added if-statment on line 115 to check if product repo is empty.

#### 11/29/2023
F. Add a “Buy Now” button to your product list.

Added Buy Now button to mainscreen.html page on line 96.\
Created BuyProductController to take in a product ID and decrement the inventory if there is more than 0.\
BuyProductController returns a success or error view depending on the amount of items in stock.

#### 11/29/2023 
G. Modify the parts to track maximum and minimum inventory.

<em>Updated 11/30/2023</em>

In Part.java:\
Added maxInv variable on line 34\
Addedmax validation for variable\
Added minInv variable on line 36\
Added min validation for variables\
Created new constructor on lines 59 - 99\
Created getters and setters on lines 108 - 123\
Created if statement on check if inventory is within max and min range\

Added if logic to return error message if inventory does not fall within min and max range
to addinhousepart (line 42 - 45) and addoutsourcedpart (line 43 -46)

Added fields for min and max inventory in InhousePartForm.html on lines 24-28\
Added fields for min and max inventory in OutsourcedPartForm.html on lines 25-29

Renamed db file to spring-boot-h2-db-lb-project.mv.db\
Changed application.properties line 6 to include new file name.

#### 11/30/2023
H. Add validation for between or at the maximum and minimum fields.

Updated lines 142 - 149 on Part.java to return a message depending on inventory min and max\
Updated lines 42 - 46 on AddInhousePartController to display error message depending on min or max values\
Updated lines 43 - 47 on AddOutsourcedPartController to display error message depending on min or max values

Added if statment on line 38 - 41 of EnufPartsValidator to display low inventory message if the amount of products added causes the 
part inventory to go below the minimum amount.\
Updated message on ValidEnufParts to display low inventory.

#### 11/30/2023
I. Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

Added Unit tests for getMinInv, setMinInv, getMaxInv, setMaxInv on PartTest on lines 160 - 194

#### 11/30/2023
J. Remove the class files for any unused validators in order to clean your code. 

Removed unused DeletePartsValidator

