# ChangeLog

## 1.1.0 (09/14/2026)

- The following clients were added:
  - `VeroApiV2Client`
- The following operations were added to `InternationalShippingClient`:
  - `getCpscProfilesAsync`
- The following members were added to `OtherApisClient`:
  - `veroApiV2`

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `VeroClient`:
  - `getVeroReasonCodesAsync`: `(String, RequestOptions)` → `(String, String, RequestOptions)`
