###### Setting up a Spring Boot Project

#### Steps to set up a Spring Boot project with GraphQL

a. Crate a new Spring Boot Project

b. Add the necessary dependencies for GraphQL

c. Configure the GraphQL endpoint


###### Documentation
##### GraphQL CRUD Operation with Spring Boot

GraphQL is a powerful query language that allows us to perform CRUD operations in Spring boot applications. In this document, we will explore the basic of GraphQL.

GrpahQL is a query language for APIs that provides a more efficient and flexible alternative to REST, with GraphQL, clients can request only the data they need,reducing the amount of data transferred over the network and improving performance.


###### Schema Definition

#### Defining the GraphQL schema for CRUD operations

a. Types : Define the data types used in the schema

b. Queries: Define read operation

c. Mutation: Define create,update and delete operations.

d. Subscription: Define real-time data updates.


###### Querying Data

#### Performing read operations using GraphQL queries

a. Filtering: Retrieve specific data based on conditions

b. Pagination: Retrieve data in chunks to improve performance

c. Sorting: Order the retrieved data based on specific criteria


###### Creating Data

#### performing create operations using GraphQL mutations

a. Input Type:  Define the input data structure for create operations.

b. Validation: Validate the input dta before creating the record.


###### Updating Data

#### Performing update operations using GraphQL mutations

a. Input Types: Define the input data structure for update operations.

b. Partial Updated: Handle partial updates of the record.


###### Deleting Data

#### Performing delete operations using GraphQL mutations

a. Input Type: Define the input data structure for delete operations.

b. Cascading Deleted: Handle cascading deleted of related records.

###### Error Handling

#### Best practices for handling errors in GraphQL 

a. Error Type:  Define custom error types for different scenarios

b. Error Messages: Provide meaningful error messages to clients

c. Error Handling Strategies:  Handling errors gracefully and provide appropriate responses

