pipeline {
  agent any
  stages {
    stage('Set Env Variables') {
      parallel {
        stage('Set Env Variables') {
          steps {
            sh '''\'\'\'url1=https://"$Env$url"
curl -s $url1 | grep branch | awk \'{print $3}\' | sed \'s/\\"//g\' | sed \'s/,//g\'\'\'\',
returnStdout: true'''
          }
        }

        stage('Env var') {
          steps {
            script {

              def commit = sh(script: '''
url1=https://"$Env$url"
curl -s $url1 | grep branch | awk '{print $3}' | sed 's/\"//g' | sed 's/,//g'
''',
              returnStdout: true)
              buildName "#${params.Env}_${commit}_${BUILD_NUMBER}"
              buildDescription "Executed @ ${NODE_NAME}"
              withCredentials([azureServicePrincipal('TDDAutomationAzure')]) {
                azure_sub_id = "${AZURE_SUBSCRIPTION_ID}"
                azure_client_id = "${AZURE_CLIENT_ID}"
                azure_client_sec = "${AZURE_CLIENT_SECRET}"
                azure_tenant_id = "${AZURE_TENANT_ID}"

              }
              if ("$params.buildFile" == "TDD-suite") {
                testngfile = "testng.xml"
              }
              if ("$params.buildFile" == "RT-suite") {
                testngfile = "testngrt.xml"
              }
              if ("$params.Env" == "qauat02") {
                baseUrl = "https://qauat02.logicmonitor.com/santaba/rest/"
                company = "qauat02"
                target = "qauat02"
                basicUser = "lmregistry"
                basicPassword = "0qHp9U6ZZF4yu3zMMUFk"
                portalUser = "automation"
                portalPassword = "!!!L0g1cm0n"
                browser = "chrome"
                headlessChromeBrowserWindowWidth = 1680
                headlessChromeBrowserWindowHeight = 963
                registryUrl = "https://lmregistry-test-us-west-2.logicmonitor.net/rest/"
                coreServerUrl = "qauatrt.logicmonitor.com"
                repositoryUserName = "automation"
                repositoryPassword = "!!!L0g1cm0n"
              } else if ("$params.Env" == "qauat01") {
                baseUrl = "https://qauat01.logicmonitor.com/santaba/rest/"
                company = "qauat01"
                target = "qauat01"
                basicUser = "lmregistry"
                basicPassword = "0qHp9U6ZZF4yu3zMMUFk"
                portalUser = "automation"
                portalPassword = "!!!L0g1cm0n"
                browser = "chrome"
                headlessChromeBrowserWindowWidth = 1680
                headlessChromeBrowserWindowHeight = 963
                registryUrl = "https://lmregistry-test-us-west-2.logicmonitor.net/rest/"
                coreServerUrl = "qauat.logicmonitor.com"
                repositoryUserName = "automation"
                repositoryPassword = "!!!L0g1cm0n"
              } else if ("$params.Env" == "qauat03") {
                baseUrl = "https://qauat03.logicmonitor.com/santaba/rest/"
                company = "qauat03"
                target = "qauat03"
                basicUser = "lmregistry"
                basicPassword = "0qHp9U6ZZF4yu3zMMUFk"
                portalUser = "automation"
                portalPassword = "!!!L0g1cm0n"
                browser = "chrome"
                headlessChromeBrowserWindowWidth = 1680
                headlessChromeBrowserWindowHeight = 963
                registryUrl = "https://lmregistry-test-us-west-2.logicmonitor.net/rest/"
                coreServerUrl = "qauat.logicmonitor.com"
                repositoryUserName = "automation"
                repositoryPassword = "!!!L0g1cm0n"
              } else if ("$params.Env" == "qapr") {
                baseUrl = "https://qapr.logicmonitor.com/santaba/rest/"
                company = "qapr"
                target = "qapr"
                basicUser = "lmregistry"
                basicPassword = "0qHp9U6ZZF4yu3zMMUFk"
                portalUser = "automation"
                portalPassword = "!!!L0g1cm0n"
                browser = "chrome"
                headlessChromeBrowserWindowWidth = 1680
                headlessChromeBrowserWindowHeight = 963
                registryUrl = "https://lmregistry-test-us-west-2.logicmonitor.net/rest/"
                coreServerUrl = "qauat.logicmonitor.com"
                repositoryUserName = "automation"
                repositoryPassword = "!!!L0g1cm0n"
              }
            }

          }
        }

      }
    }

  }
}