.DEFAULT_GOAL := help
.PHONY: help
help:	## コマンド一覧表示
	@grep -E '^[[:alnum:]_-]+:.*?## .*$$' $(MAKEFILE_LIST) | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

.PHONY: run-db
run-app:	## dbサーバを起動
	docker-compose -f compose.yml up
