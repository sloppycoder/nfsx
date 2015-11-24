## project wish list

Wish list for next steps in the project. Things that I'd like to do but not specific enough to become an issue will be tracked here.
Suggestions are welcome. Help will be appreciated.

### Architecture
* rethink Netflix OSS libraries and see what ones are essential 
  * Is Eureka neccessary for docker based deployment, since kubernetes/swarm both incldue service discovery compoents already?
* logging streaming and search mechanism 
  * AWS Kinesis + hosted ELK ?
  * Google hosted Kubernetes ?

### Technical Details
* Audit trail
  * Add support getting info from parameters passed to jointpoint.
  * Use a seperate data source.
  * Send audit info to JMS queue instead of logging to database
* Implement OAuth2 SSO in services layer
* Nicer UI. I know it's ugly for now.

### Testing Related
* Script to generate/load larger data set
* Load test tool and scripts
* Functional test tools and scripst (can load test and functional test share as much components as possible?)


