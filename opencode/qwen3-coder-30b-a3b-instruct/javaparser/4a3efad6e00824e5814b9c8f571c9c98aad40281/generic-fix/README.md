# Generic CertificationPermission Fix

This is a generic transformation rule that can fix the breaking change where CertificationPermission 
was moved from eu.europa.esig.dss.pades to eu.europa.esig.dss.enumerations.

## Usage:
java -cp "lib/*:target/classes" github.chains.Main /path/to/java/sources

## Fix Applied:
- Replaces import statement: eu.europa.esig.dss.pades.CertificationPermission
- With: eu.europa.esig.dss.enumerations.CertificationPermission

## For Projects with Multiple Breaking Changes:
This fix addresses the core compilation issue. Projects may also need fixes for:
- Missing methods like isCheckCertificateRevocation()
- Other API changes in DSS library updates
