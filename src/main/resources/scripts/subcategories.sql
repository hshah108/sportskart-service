db.subcategory.drop();
db.createCollection("subcategory");
db.subcategory.insertOne({subCategoryId:"1", categoryId:"1", itemCode:"bat",  displayText: "Bat"});
db.subcategory.insertOne({subCategoryId:"2", categoryId:"1", itemCode:"ball", displayText: "Ball"});