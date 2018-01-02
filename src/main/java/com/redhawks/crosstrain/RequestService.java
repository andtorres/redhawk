package com.redhawks.crosstrain;

import java.util.Date;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class RequestService {
    private MongoCollection table;

    public RequestService() {

        /* Connect to MongoDB */
        // Since 2.10.0, uses MongoClient
        MongoClient mongo = new MongoClient("localhost", 27017);

        /* Get database */
        // if database doesn't exists, MongoDB will create it for you
        MongoDatabase db = mongo.getDatabase("testdb");

        /* Get collection / table from 'testdb' */
        // if collection doesn't exists, MongoDB will create it for you
        table = db.getCollection("user");
    }

    public String hello()
    {
        return "hello";
    }

    public String delete()
    {
        return "delete";
    }

    public Document createDocument()
    {
        /* Insert */
        // create a document to store key and value
        Document document = new Document("name", "Andrew Torres")
                .append("age", 21)
                .append("createdDate", new Date());
        table.insertOne(document);

        return document;
    }
}
