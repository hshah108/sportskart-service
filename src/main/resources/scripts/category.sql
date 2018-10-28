db.removeCollection("category");
db.createCollection("category");
db.category.insert(categoryId: "1", itemCode: "cricket", displayText: "Cricket");
db.category.insert(categoryId: "2", itemCode: "football", displayText: "Football");