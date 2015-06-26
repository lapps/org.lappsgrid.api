The LAPPS Grid API
================

Interfaces and exception classes used by the [LAPPS Grid](http://www.lappsgrid.org).

## Maven

```xml
	<dependency>
		<groupId>org.lappsgrid</groupId>
		<artifactId>api</artifactId>
		<version>2.0.0</version>
	</dependency>
```

The LAPPS Grid API defines a single main interface: `WebService`:

```java
public interface WebService {
    String getMetadata();
    String execute(String input);
}
```

and two *naming interfaces*, that is, interfaces that extend `WebService` but do not
add any methods of their own:

```java
public interface DataSource extends WebService { }

public interface ProcessingService extends WebService { }
```

All LAPPS Grid services exchange [Data](https://lapps.github.io/org.lappsgrid.serialization/index.html?org/lappsgrid/serialization/Data.html)
object as JSON strings. The main difference between a `DataSource` and a `ProcssingService` is
how the `Data` objects are interpreted in the `execute` method.
 
- `ProcessingServices` accept an input document and produces an output document. The `discriminator`
field is used to specify the format of the data in the `payload`.
- `DataSources` provide data.  The `discriminator` will be a URI specifying the action the
DataSource is to perform.  For example, the DataSource may be asked to return a single document
or provide a list of ID values for all documents available from the DataSource.

For example:

```java

DataSource source = ...
ProcessingService tokenizer = ...
Data<String> data = new Data<>("http://vocab.lappsgrid.org/ns/get", "MASC3-0202");
// Fetch some data.
String json = source.execute(data.asJson())
// Process some data.
String response = tokenizer.execute(json)
```
