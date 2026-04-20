# Breaking Changes: net.datafaker:datafaker 1.3.0 → 1.4.0
Total: 28 (binary-breaking: 20, source-breaking: 20)

## net.datafaker.Address

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Address.firstName()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Address.lastName()`

## net.datafaker.Barcode

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Barcode.data()`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Barcode.typeAndData()`

## net.datafaker.Commerce

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Commerce.color()`

## net.datafaker.DateAndTime

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.DateAndTime.between(java.util.Date,java.util.Date)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.DateAndTime.between(java.util.Date,java.util.Date,java.lang.String)`

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.DateAndTime.str2unit(java.lang.String)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.birthday()`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.birthday()`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.birthday(int,int)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.birthday(int,int)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.future(int,int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit,java.util.Date)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit,java.util.Date)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.past(int,int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_CHANGED_INCOMPATIBLE [binary ✓ | source ✗]
- OLD RETURN TYPE (incompatible): `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit,java.util.Date)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit,java.util.Date)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.birthday()`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.birthday()`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.birthday(int,int)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.birthday(int,int)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.future(int,int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit,java.util.Date)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.future(int,java.util.concurrent.TimeUnit,java.util.Date)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.past(int,int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit)`

### METHOD_RETURN_TYPE_ERASURE_CHANGED [binary ✗ | source ✓]
- OLD RETURN TYPE (erasure changed): `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit,java.util.Date)`
+ NEW RETURN TYPE: `net.datafaker.DateAndTime.past(int,java.util.concurrent.TimeUnit,java.util.Date)`

## net.datafaker.FakeCollection

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.FakeCollection.toCsv()`

## net.datafaker.FakeCollection$Csv

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.datafaker.FakeCollection$Csv`

## net.datafaker.FakeCollection$CsvBuilder

### TYPE_REMOVED [binary ✗ | source ✗]
- REMOVED TYPE: `net.datafaker.FakeCollection$CsvBuilder`

## net.datafaker.Faker

### METHOD_REMOVED [binary ✗ | source ✗]
- REMOVED: `net.datafaker.Faker.crypto()`

