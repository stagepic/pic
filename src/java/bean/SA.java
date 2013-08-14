/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Set;
//hello world , this is a change 
/**
 *
 * @author abel
 */
public class SA {
   
MongoClient mongoClient;
 DB db;

     public SA() throws UnknownHostException{
     mongoClient = new MongoClient( "localhost" , 27017 );
     db = mongoClient.getDB( "test" );
     //Jongo jongo = new Jongo(db);
     Set<String> colls = db.getCollectionNames();
        for (String s : colls) {
            System.out.println(s);
        }
     }
}
