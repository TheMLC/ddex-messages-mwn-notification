
generate-all: generate-mwn-11 generate-mwn-13 generate-mwn-131 generate-mwn-11-jakarta generate-mwn-13-jakarta generate-mwn-131-jakarta
install-all: install-mwn-11 install-mwn-13 install-mwn-131 install-mwn-11-jakarta install-mwn-13-jakarta install-mwn-131-jakarta

generate-11: generate-mwn-11 generate-mwn-11-jakarta
install-11: install-mwn-11 install-mwn-11-jakarta

generate-13: generate-mwn-13  generate-mwn-13-jakarta
install-13:  install-mwn-13  install-mwn-13-jakarta

generate-131: generate-mwn-131  generate-mwn-131-jakarta
install-131:  install-mwn-131  install-mwn-131-jakarta

clean-all:  clean-mwn-11 clean-mwn-13 clean-mwn-131 clean-mwn-11-jakarta clean-mwn-13-jakarta clean-mwn-131-jakarta

clean-mwn-11: 
	cd ddex-mwn-11 && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean

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
		clean package install

clean-mwn-11-jakarta: 
	cd ddex-mwn-11-jakarta && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean 

generate-mwn-11-jakarta: 
	cd ddex-mwn-11-jakarta && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-11-jakarta: 
	cd ddex-mwn-11-jakarta && \
	mvn  \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install

clean-mwn-13-draft: 
	cd ddex-mwn-13Draft && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean

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

clean-mwn-13: 
	cd ddex-mwn-13 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean

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

clean-mwn-13-jakarta: 
	cd ddex-mwn-13-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean 

generate-mwn-13-jakarta: 
	cd ddex-mwn-13-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-13-jakarta: 
	cd ddex-mwn-13-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install

clean-mwn-131: 
	cd ddex-mwn-131 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean

generate-mwn-131: 
	cd ddex-mwn-131 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

install-mwn-131: 
	cd ddex-mwn-131 && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install

generate-mwn-131-jakarta: 
	cd ddex-mwn-131-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean package

clean-mwn-131-jakarta: 
	cd ddex-mwn-131-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean

install-mwn-131-jakarta: 
	cd ddex-mwn-131-jakarta && \
	mvn \
	 	--no-transfer-progress \
		--batch-mode \
		--fail-fast \
		clean install
