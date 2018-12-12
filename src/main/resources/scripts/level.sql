db.level.drop();
db.createCollection("level", { capped : true, size : 50 * 1024 * 1024, max : 100 * 1000 } );

db.level.insertOne({levelId: "1", levelCode: "beginner", displayText: "Beginner"});
db.level.insertOne({levelId: "1", levelCode: "advance", displayText: "Advance"});
db.level.insertOne({levelId: "1", levelCode: "professional", displayText: "Professional"});