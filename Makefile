PAGES=../org.lappsgrid.api.pages
BRANCH=$(shell git branch | grep \* | cut -d\  -f2)

help:
	@echo "Some help is needed..."
	
clean:
	mvn clean
	
jar:
	mvn package
	
deploy:
	mvn javadoc:jar source:jar deploy

docs:
	mvn site

site:
	git stash
	mvn site
	git checkout gh-pages
	rm *.html
	if [ -e *.ico ] ; then rm *.ico ; fi
	if [ -e *.gif ] ; then rm *.gif ; fi
	rm -rf org resources
	git commit -a -m "Removed old files from gh-pages."
	git push origin gh-pages
	cp -r target/site/apidocs/* .
	git add *.html *.git *.ico org resources
	git commit -a -m "Added new files."
	git push gh-pages
	git checkout $(BRANCH)
	git stash apply

