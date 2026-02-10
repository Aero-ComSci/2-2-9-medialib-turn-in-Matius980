mkdir -p src/main/java src/test/java

if [ -f Book.java ]; then mv Book.java src/main/java/ 
fi

if [ -f Movie.java ]; then mv Movie.java src/main/java/ 
fi


if [ -f BookTest.java ]; then mv BookTest.java src/test/java/ 
fi

cat > build.gradle <<'EOF'
plugins { id 'java' }

repositories { mavenCentral() }

dependencies { 
testImplementation 'org.junit.jupiter:junit-jupiter:5.10.1'
testRuntimeOnly 'org.junit.platform:junit-platform-launcher:1.10.1'
}

test { useJUnitPlatform() } 
EOF
