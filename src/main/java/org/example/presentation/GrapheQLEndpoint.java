package org.example.presentation;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.servlet.SimpleGraphQLServlet;

import javax.servlet.annotation.WebServlet;
import graphql.schema.GraphQLSchema;
import org.example.graphQLResolvers.QueriesResolver;
import org.example.businessLogic.StudentBusinessLogic;


@WebServlet(urlPatterns = "/graphQLApi")
public class GrapheQLEndpoint extends SimpleGraphQLServlet {

    public GrapheQLEndpoint ()
    { super(buildSchema());}


   public static GraphQLSchema buildSchema ()
   {
       StudentBusinessLogic studentBusinessLogic = new StudentBusinessLogic() ;
       return SchemaParser.newParser().file("schema.graphqls").resolvers(new QueriesResolver(studentBusinessLogic)).build().makeExecutableSchema();

   }


}
