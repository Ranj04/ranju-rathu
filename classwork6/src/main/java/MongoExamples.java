import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoExampless {

    public static void main(String args[]) {
        // open connection
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // get ref to database
//        MongoDatabase db = mongoClient.getDatabase("MyDatabase");
//        // get ref to collection
//        MongoCollection<Document> myColection = db.getCollection("MyCollection");
//        // create a new document
//
//        Document doc = new Document("name", "MongoDB")
//                .append("type", "database")
//                .append("count", 1)
//                .append("info", new Document("x", 203).append("y", 102));
//        // insert document into collection
//        myColection.insertOne(doc);
//
//        // count all documents in collection
//        System.out.println("Total Documents :" + myColection.count());
//
//        // iterate some documents
//        // https://www.mongodb.com/docs/manual/reference/operator/query/
//        List<Document> docs = myColection.find().limit(100).into(new ArrayList<>());
//
//        // fetching a value from a search
//        // Common filters: https://www.mongodb.com/docs/manual/reference/operator/query-comparison/
//        Document search = myColection.find(Filters.eq("count", 1)).first();
//        System.out.println(search.getString("type"));
//
//        // updating a value
//        // https://www.mongodb.com/docs/manual/reference/operator/update/
//        myColection.updateOne(Filters.eq("count", 1), new Document("$set", new Document("count", 110)));
    }
}
