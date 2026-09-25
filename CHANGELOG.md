# ChangeLog

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`VeroClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getVeroReasonCodesAsync` | `(String accessToken, RequestOptions requestOptions)` | `(String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

### Added

- Client `VeroApiV2Client` and member `OtherApisClient.veroApiV2`.
- `InternationalShippingClient.getCpscProfilesAsync`.