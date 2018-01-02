add "--add-modules java.xml.bind" to VM Options to reduce error output

currently using MongoDB with intention to switch to DynamoDB
    - Change pom.xml to remove and imports to remove ALL dependency to MongoDB
    - Also stuff to WEB-INF/lib to be removed (I'm not sure if this is done at build-time through maven or if I manually imported and need to manually remove)

    - Currently have a potential memory leak after shutting down server. I believe it to be due to not explicitly closing connection to MongoDB during shutdown.
        * Copy and pasting the warning message brings some good stackoverflow threads about this. Might be due to Tomcat configurations maybe.

Things to work on:
    - First call to API is when we Instantiate the RequestService for Request Controller (?). Causes first API call to take long time (~5 secs)
    - UNIT TESTING EVERYTHING FAM
        * Automatic unit testing at compile/build time
        * Clover (?) Code Coverage >75%
    - "At least one JAR was scanned for TLDs yet contained no TLDs"
        * Pretty negligible. Just slows us down marginally during build/deploy