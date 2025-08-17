Notes :
-------
1) If you need strict ACID transactions (multi-row, multi-table operations with rollback on failure) → SQL databases are better.

2) If you don’t need complex transactions and prefer flexibility & scalability → MongoDB (NoSQL) is a good fit.

3) In MongoDB we have:
                      1) Collection = Table** in relational databases.
                      2) Document = Row (Record)** in relational databases.

4) A **database** in MongoDB holds **collections** (like a schema in RDBMS).
* Each **collection** holds multiple **documents**.
* Each **document** is basically a JSON (or BSON internally) object — with fields (similar to columns), but fields can vary across documents (unlike SQL where rows must follow the same schema).

