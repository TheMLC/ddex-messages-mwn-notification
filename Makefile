

generate-mwn-11: 
	cd ddex-mwn-11 && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-11: 
	cd ddex-mwn-11 && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install

generate-mwn-13-draft: 
	cd ddex-mwn-13Draft && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-13-draft: 
	cd ddex-mwn-13Draft && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install

generate-mwn-13: 
	cd ddex-mwn-13 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-13: 
	cd ddex-mwn-13 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install
