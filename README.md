# spring-data
learning the spring data jpa

### One to One
In Spring Data JPA, a one-to-one relationship refers to a specific type of association
between two entities where each instance of one entity is related to exactly one instance of another entity.
Using the @OneToOne Annotation.
use cascade = CascadeType.ALL for perform the operation on join table without creating repository class

#### Using a Foreign Key:
In this approach, we create a foreign key column in one of the entities to establish the one-to-one relationship.
For example, consider a scenario where we’re building a user management system. Each user should have exactly one 
mailing address, and each mailing address should be associated with only one user. user 1 = mail 1 relation is one to one.

### One to Many
In Spring Data JPA, a one-to-many relationship refers to an association between two entities where one entity (the parent) 
can be linked to multiple instances of another entity (the child), but each child is associated with only one parent.
ex. one student but having multiple address that one to many 
##### Using the @OneToMany Annotation:
In this approach, we use the @OneToMany annotation to define the relationship between the parent and child entities.
Typically, the child entity owns the relationship, and the parent entity contains the @OneToMany annotation.
Here’s an example of how you can model a one-to-many relationship between a Department (parent) and Employee (child).
##### Database Schema:
The database schema for this relationship will have an employees table with a foreign key column (department_id) referencing 
the id column of the departments table.

### Many to Many
In Spring Data JPA, a many-to-many relationship represents an association between two entities where each instance of
one entity can be related to multiple instances of another entity, and vice versa.

##### Using the @ManyToMany Annotation:
The @ManyToMany annotation is used to define a many-to-many relationship between two entities.
Typically, a join table (also known as a linking or intermediate table) is created in the database to manage this relationship.

##### Database Schema:
The database schema will include three tables: students, courses, and the join table (student_course) that holds the associations.