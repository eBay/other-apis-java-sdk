# ChangeLog

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
