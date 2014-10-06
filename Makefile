PAGES=../org.lappsgrid.api.pages

help:
	@echo "Some help is needed..."
	
clean:
	mvn clean
	
jar:
	mvn package
	
deploy:
	mvn javadoc:jar source:jar deploy
	
site:
	cd $(PAGES) ; git checkout gh-pages ; git pull
	mvn site
	cp -r target/site/apidocs/* $(PAGES)
	cd $(PAGES) ; git add . ; commit "Updated Maven site" ; push
	
