package com.example.mm.mapnotifier;

import java.util.List;

public class RouteParser {
    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJMRZhH_TlDDkRQXqtMEINWrg","types":["street_address"]},{"geocoder_status":"OK","place_id":"ChIJC0BwhguwDTkRQ8GmqrSqLnM","types":["administrative_area_level_1","political"]}]
     * routes : [{"bounds":{"northeast":{"lat":29.0643148,"lng":77.3739903},"southwest":{"lat":28.5544229,"lng":76.0877631}},"copyrights":"Map data ©2018 Google","legs":[{"distance":{"text":"161 km","value":161379},"duration":{"text":"3 hours 6 mins","value":11189},"end_address":"Haryana, India","end_location":{"lat":29.0643148,"lng":76.0877631},"start_address":"near balaji general store (bhoomiya mandir Room no 2, Baraula, Sector 49, Noida, Uttar Pradesh 201307, India","start_location":{"lat":28.5627292,"lng":77.3739903},"steps":[{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":962},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5575112,"lng":77.3282903},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tCXz@Vx@"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":480},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"mshmDyd~vMLb@Ld@dApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5575112,"lng":77.3282903},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5716},"duration":{"text":"9 mins","value":521},"end_location":{"lat":28.6099211,"lng":77.1392425},"html_instructions":"Keep <b>right<\/b> to continue on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>/<b>NH 48<\/b><div style=\"font-size:0.9em\">Continue to follow Mahatma Gandhi Marg/Ring Rd<\/div><div style=\"font-size:0.9em\">Pass by Dhaula Kuan Enclave I (on the left in 2.9&nbsp;km)<\/div>","maneuver":"keep-right","polyline":{"points":"_dlmDyw`vMcHlDiErBqOnHk@ZCBc@RA?CBm@V_D|AgKbFmCvAs@\\oAh@i@ToAp@kEjCaBbAkEbC{@d@kAl@eBdAgAp@oAt@a@XWPYT_@ViAp@OHQHWLgDjAeBn@iAd@_Aj@g@Z_CrAy@d@gDnBsDvBWPEBiC`BmBpAA@m@f@GDc@f@m@r@GFUX_@d@Y^o@~@SXeCpDkHlKc@l@oExGk@x@q@nAYp@[x@Qr@SdAUbC{@zKm@xGu@xJc@nGkApOQnCCTETCT[tAq@bC}@dCg@bAo@hAk@t@w@~@}@|@{@`AWTOLGHoDfCw@d@e@Xg@^WTs@l@"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"6.8 km","value":6810},"duration":{"text":"9 mins","value":553},"end_location":{"lat":28.6657009,"lng":77.1333743},"html_instructions":"Keep <b>left<\/b> to stay on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>","maneuver":"keep-left","polyline":{"points":"_{rmDggyuMi@d@qAjAeA|@[RwBnA}@n@y@n@q@d@kA|@wAx@{@Zm@Ny@N_@DI@_@BU@Y?e@Aq@Ea@As@C_AGc@Gi@CkB?{B@}DDmDC_AC_AC_A?[@]@e@FUDmAZuAZsDbAwA`@wA^}Bp@yDlAkBh@iCr@cAXyCz@e@LsCx@mCv@gFxAy@T[J{Ab@_AXSFmAZcD|@y@VmL|CmL|CSDYHUHc@Ja@LiHpBcElAYH}DnAaL~CKBWHQFcBh@qA\\{@ToBf@{Bl@cCv@aAXwJnCYHWFgC`ASFE@e@PC@m@Tm@ToA`@YLiA`@o@RSDSBSB[B_@@S@e@?a@COAYEWEYGOEOGQG[OCAEAKGIEGEGEIGOKe@[cA{@USYUa@]SOoC_CsDgD]Yo@m@{@u@YSMMOO]_@i@e@cA{@k@e@]WWOSMSKSKSEQEUA]Ce@?kEMaBEoAQICICICIGIGSOuAgAWUc@c@c@g@WYUUKOA?iAsA?ACAAACEA??AAAMOw@aAIKMOc@k@uAeBqBiCW["},"start_location":{"lat":28.6099211,"lng":77.1392425},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":170},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.6666874,"lng":77.13268769999999},"html_instructions":"Turn <b>left<\/b> toward <b>Rd Number 41<\/b>","maneuver":"turn-left","polyline":{"points":"sw}mDqbxuMG@I?ECGCc@g@ECEAA?SLMFqAdD"},"start_location":{"lat":28.6657009,"lng":77.1333743},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":504},"duration":{"text":"1 min","value":80},"end_location":{"lat":28.6688169,"lng":77.12824619999999},"html_instructions":"Continue onto <b>Rd Number 41<\/b><div style=\"font-size:0.9em\">Pass by the park (on the left in 350&nbsp;m)<\/div>","polyline":{"points":"y}}mDi~wuMIXKVGJ_@d@mA|Aq@dAe@x@cA|BeAdDa@~AGh@Eb@Cf@Gz@"},"start_location":{"lat":28.6666874,"lng":77.13268769999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":707},"duration":{"text":"3 mins","value":152},"end_location":{"lat":28.67505839999999,"lng":77.12909189999999},"html_instructions":"Turn <b>right<\/b> onto <b>S Manohar Singh Marg<\/b>/<b>North Ave<\/b><div style=\"font-size:0.9em\">Pass by Vijaya Bank (on the left in 600&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"ck~mDqbwuMANyBQuAIgBQw@GO?iAICA}@G_AGgAMkBQy@G_AI}BQcAGcAIOAq@G[E"},"start_location":{"lat":28.6688169,"lng":77.12824619999999},"travel_mode":"DRIVING"},{"distance":{"text":"17.2 km","value":17157},"duration":{"text":"33 mins","value":1984},"end_location":{"lat":28.6889251,"lng":76.9541955},"html_instructions":"Turn <b>left<\/b> onto <b>Rohtak Rd<\/b><div style=\"font-size:0.9em\">Pass by Metro Pillar Number 568 (on the right in 10.8&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"cr_nDygwuMK|AmA~Ra@lFATgBfXWbDK|Ak@lIe@vGUtDIrA?DEn@ATATEp@A\\KvAe@hHKvAInAWnDW~CeApPc@fGAL}@|MA@cAvPy@fOK~A[xEKbCCXAVCRIhBInBUdFCb@YjFMjBKnBKhBGr@CZKzBMlB_@zGYfGALKxBk@fKUxDYvEMfCQlCIdAY`EYtEEdAIdBSdEm@`JKbBIfAAb@Af@?N@h@@JCxKCtG?R?@A`@ClK?dH?XAX?J?~G@^?@?R?fB?bFAp@Cv@G|A?^?|@@z@?DJtE@jA@xA@hB?hA?nAChBChG?tCAfB?t@AnMEdG?hACrG?jKCrFCnH@dA?nBAh@AxAAl@?r@ArGCdD?vCA|C?jAA`B?l@ClKAdB@bBAnGCpBCpAK|CEv@CrACbAAVCd@E|@IhDQzEGjEm@`O_@dKEdAI|AIp@Md@[tDAL?LCj@?LAL?BAv@@v@BRB\\@T?VATYbHO|DEbAWzGC\\OhFAPK|BGjBKlCY`IGrAG~AKhCC|@UxFG|AGpAKdCWxGM~CGnACj@AXa@nK]nKCh@Ez@Cv@GdAEhAO|DEbAG|AGzAEt@StFEjA_@bIw@|SIjBm@jNOxCAf@]zIe@hLY`GG~BK~COzDCp@AXKdCGrAEjAAZMjCUtHG~AEjAc@~KMtCEb@a@lJAFS`EGfAAPMfBW|D_AfSE`AMzCIrBUjE"},"start_location":{"lat":28.67505839999999,"lng":77.12909189999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":732},"duration":{"text":"1 min","value":66},"end_location":{"lat":28.6896098,"lng":76.9467363},"html_instructions":"Continue straight onto <b>NH9<\/b>","maneuver":"straight","polyline":{"points":"yhbnDwbutM[~JEp@]pIStDc@jKIxAEr@"},"start_location":{"lat":28.6889251,"lng":76.9541955},"travel_mode":"DRIVING"},{"distance":{"text":"37.5 km","value":37544},"duration":{"text":"35 mins","value":2084},"end_location":{"lat":28.8449393,"lng":76.67692389999999},"html_instructions":"Turn <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Partial toll road<\/div><div style=\"font-size:0.9em\">Pass by Power Point (on the left)<\/div>","maneuver":"turn-left","polyline":{"points":"ambnDctstMv@?lENN@bCDbFP|HVfFNv@F`AHjAR`C`@vF|@LBF@B?@?`@DPBr@BhAD~@BzADpCJ`CF`GPjCH|CH~EP\\Bl@DVDNBPBd@LXJj@X\\RVRLJXVZb@NTJPLVNXJZHVDPDTFZRpAXfBf@tCnApHJf@Jh@ThANl@T`Af@pBj@jB`@xATz@~@bDbAxDb@`Bl@vBz@tCZbAhAnDp@tBf@xAjAnDlBtFdBjFdBdFDLDLHXjCvHbBbFn@lBf@~ALf@@BDPDV@HF\\DPF^DXBT@XBZ@^@`@?^?PA^?ZCh@CLE`@C\\EXETGVETERENABCHGPGRGPGLGLGNEJGJ]p@cB|CqA~BuAdCyAnCs@rAq@nAg@|@QZg@t@_@b@o@p@_@\\c@`@i@h@STSXW`@[n@KPWf@e@bAWh@]|@[z@]fASp@cC~Hc@tAs@~BY`Ay@nC_AzC_AvCg@vASj@Uj@_CnGcH|QiDpJmBjFwB`Gq@dBs@bBm@tAcA~By@fBeAtBEN{@dBaAxBQ\\w@hBcArBm@fAW^q@z@y@x@_@Zo@f@aAl@a@Rc@Tu@Zo@XaA`@iAd@mAf@_@Pw@ZaHtCeCbAcCbAaDpA_DpAYJWLiGfCeIbD_@NmBv@aG`CgA`@cAb@kClAsHnDs@\\s@Z{@\\oCdAYJYLy@Z}HxCkIxCwHvCm@TmCfAmGhCiFtBsBz@yAl@qFzBoBz@mD|AoAj@y@^eH~CuJfEw@Xw@Z{B`AuKvEyB~@uB~@mGrCWJWJgAh@WLm@ZOHi@\\]RYTMJOLQRWZS\\CDOVQ\\O^w@hBWdAW`AsAhFmA`Ek@bBgDlH}CxG}FzMo@xAgA`CSb@Sb@_AnBeE|H}C`Gk@fASb@Q`@MZMZo@~AM^Ut@Sn@Mf@y@~Cq@lCs@pCUz@oAlFy@fDa@fBOp@_@bB}@dE{BbK_CjKgA~EwCpNm@zC_@hBMr@Gh@CZCVGr@G`AMlBCf@QlCEp@Ef@Ir@Gh@EXG^Ib@K`@M^Un@]x@g@fAq@tAm@lAcAxBcBnDuAxCWp@Qj@c@`BMh@Ij@MfAI`AEf@Cn@CtA?jA?tC?hACn@EhAGt@AJMbA_@lBg@dBq@lBiA|Ci@zASj@]v@e@fAS`@?@[d@k@v@i@j@ON[Vo@f@OHKF_@PYLGBYJ_@Ja@He@Je@Ha@Hq@LgCViAPk@Li@LiAXkA\\wAb@uAf@o@Xm@XaB~@_@TKF}@l@uAjAOLg@d@aA~@aA~@e@j@c@h@s@jA?@g@t@u@xAg@lAKTm@`B]`AM\\[dAOp@Qr@_@bCe@zE]jDMvAw@rHg@`Fq@dHi@zEIn@_@tBMb@sAjDmAtCqAnCkC|FoEpJWd@KPCBEHu@fAgBdCeCbDuDdF_CfDcCfDoD`F_CdDuHdKMN_K|L{DpEED_BtBWd@Yl@Wl@EL_@tAETOdASjCYhE]|D[xBG\\]hB{@jE}@nEu@`Dq@zB_AtBcA|Be@|@c@~@eItQqBhEwAxCeClFsAjCw@lA}@bAoAfAw@`@MFeA`@m@Rq@LwDb@kEb@_CVwLjAoCZkATk@La@Ni@V{@b@OHMH_@Xc@^k@p@OTy@vAqBbEa@x@oAdCm@pAgA|BgA`CmCtFoC~F_EhIqCzF_B~Cs@nAQXa@f@WZWRq@n@o@f@a@Vy@b@c@T_A^_Bd@qDp@iNlC{MlCm@Jm@JcEr@eBb@aAZc@P[LYPc@Zm@f@e@j@GHeA`B]p@]z@Wv@}B~GgB~E}@jCGLuAtDCFyAdE_BpEaBnE{HxToCvHy@fCUj@sBtFyCnIWp@cBtEsDrK}ArEm@bBUf@_@p@cAbByIxMyAfC_BtC]l@_A~Ao@z@w@hAe@l@o@t@e@j@e@p@_AtAq@lA}@tBsBbFcAdBqG|IwErGaHbKwFnIqGpJyGpJm@f@[Va@^_@Te@X]N_@L_@LmA^o@RiDbAWHSHsDdAgDbA_GdBwDfAkEpAA?eCt@m@Vc@Tw@d@mAz@IHC@OLWTCDa@b@kAjBaAjCi@vB_@xAIXeAfEiDrMyFbU_DxNu@~BSd@oA~BA@_BlBwClD_D`DaA~@U\\Yb@[l@e@nA"},"start_location":{"lat":28.6896098,"lng":76.9467363},"travel_mode":"DRIVING"},{"distance":{"text":"24.1 km","value":24070},"duration":{"text":"20 mins","value":1191},"end_location":{"lat":28.9164077,"lng":76.4634616},"html_instructions":"Continue straight to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Sangam Dhaba (on the right in 18.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"{w`oDw}~rMYbA_@fBCZG|@Cv@?hA?v@Fr@Fp@Hr@Lh@Ll@h@lB`EzN~BtInAlEx@vCzBnIrAjEbB~FLf@Ld@dCpJbBxHbAtE`@hCHbA@Fb@`V~Ate@@h@@h@VlHD~BBpC?|BAfBCfBCfB[z[a@b^MnKC~AMjIGhIExMOng@ClIO`r@EfWAvG?vB?fD?z@AtA?tAE~HKl]E`ACn@GfAOxA{AdJgFj[a@jCKp@Id@e@xCG\\a@rBmGt]iAlGKf@_@dB_@dBkCdMcEnRMh@Mh@_CzI}AjF}@rCeC~HiAvDkAvDEL{IpYOh@c@vAkExNqE`OsAnEg@hB}@jCeDtKGRELENY|@IXq@pB]zAU~@y@xBs@`C{@fCa@zAcCdIi@fBgBpFqArDuAjDkFxMq@nBeHbQiD`JqClHg@pAgBvEcBhEgBpE}A|DKVITGNw@pB_BfEmBzEk@zAoAbDsE`LeAxCgArCyE|LsB~E}D`J_E`JgAvBuAdD_FnK[l@[l@oGnMi@z@EHkAnBELEHGH_FfJKRCFGLeCtEg@dA{E~IwB|DwAtCgBbDmB`DoB~CsB|Cw@lA{@lAwBtC}BtCaCpCaOjPkOfP}GpHkPtQcEvEmE~EaLxMsJjLsCxDeFdH_GjHa@j@ONo@n@}@n@w@b@y@^sFhB_Dz@gBh@oElAsItBUDWHcHbBgBd@gBd@_D~@y@Z}@\\_DtAiCvA"},"start_location":{"lat":28.8449393,"lng":76.67692389999999},"travel_mode":"DRIVING"},{"distance":{"text":"43.7 km","value":43729},"duration":{"text":"37 mins","value":2237},"end_location":{"lat":29.0643148,"lng":76.0877631},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Car And bike Insurance Point (on the right in 650&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"qvnoDsguqMaAh@KDc@Ve@RSHQJa@RkBjAaAj@c@ZgAt@s@n@q@r@_@b@sAbBW^OT[f@e@x@w@tAKVGPOl@Sz@i@xBk@lCg@fCi@tCk@`Dq@hDc@xB]fBiApG]zBMhAa@pDOfBOxBIfAK~@Mn@_@pBOh@iAdD{AbE}A|DiAdCo@lAiC`EaFjHeDdFaDnEgBnCoBlCsC|DcBxB{CbEoCnDu@~@a@f@QVa@l@g@v@oAxBs@vAi@pAYv@oAjDg@fBi@jCa@dCa@tCG|@K`BIhCEjCC`H?~@?t@Cx@IbAKr@YvAc@vAWr@cAhBmAhByBdD}BnDcAbBkArBiApByAhCkAtBYn@Yp@c@tAOd@UbAUjAOnAAPMpDEzA?Z@DAL@T?TJ|@TzARfATbAf@bBlDnKbCtFnBxEbClH~@pCh@dBpChMj@`IlG|f@rHbe@DXVlAH^J\\j@fBbA`DbDdH|FtJpIdP|@dC~@jFf@lKd@dS`@tT?N@V?rKMbHWzC_@~CkB~LoB`J}@xC{ChH_JdRwCxF_B~BMLOL_Ax@w@h@kBdAk@ZmDfBiB~@iB`AkBdAmBhAsA|@k@b@YTo@h@KJs@t@QP]`@i@l@a@h@{AfCy@jAKN{@lAc@r@}@vAaB`CkA`BeEzFOPQTQVOTaAtAgApBmD`GgBxC]hBsE|IEPc@z@gErIq@\\CByAxCu@~AiAxB[n@]r@[h@oEdH_AvAkCbE}A`Cc@r@[f@s@vAg@hAg@tA]bAkB`GoAzD_@bA]|@Wp@Wl@Sj@Ut@K\\IZQp@Qx@y@rC[lA]tAe@rBIh@CnAGx@@H?~AXpDbA|FdAdGdBbKfAnGPhAPdAf@nCrA~Gp@lEbAbGFf@Hl@|BbNhA|Gn@`ElAlHjAnHBJ@J~@`GhAlGBJ@J`@fCH~AA|AATEz@M~AUdBSdAUx@i@`Bq@tAcBbCYXq@n@a@^WRYRwSbOcD|BqIrFqIpF[TOLuA~@uA~@kBfAiBfAgCjAgC|@YRYP{@\\uExBmFrC_GxCcHrCiC|@g\\|LqQfGsKlEaDnBYNUVUTm@p@oAvBq@jBMZ}BfHaCvGwDdKoCfIkBzFgB|FUt@qBlH}AjFOl@Kb@EVCLEZId@UvAa@|BShAWlAm@nCaBfHk@jCo@lCSbAK^K^Yz@ABkA`DgAlC_AdCmAxCeBjEWn@Ul@Qf@Wt@_@rAiBhGuBjHs@`Cc@pAWr@sA|DaAtC_@fA_@fAk@bCo@xC[zBk@`EWfBm@lE[rBU`Aa@pAWr@cBrEo@hBgFzNaElLqBdGITk@zAMV?@[z@yFxP_BtEo@hBo@lBAB_FvNq@jB_@hAUt@Kf@A@Mp@QjAm@lEo@|ESxAm@bEu@fFq@nEEVEPIXGRELc@bA}@fBu@rA}B`Eg@z@EFILMT]b@q@x@mC~CWZSVSXMRMZUh@Md@}@vD{Lre@}@vD[dBS|A{A|LmAxJsA|JKj@IXENm@nAcFtJ}EbJ]p@c@r@c@d@IJQRa@Za@Z_EdBwAl@wIlDUHiBn@cCfAIBGDiCfAe@Xq@^g@Ve@X_@R_@Xi@^c@VsAzAMZIRILILS~@[tAEZKh@S|@G\\GVq@dDe@hCi@~Cs@|Da@zBYzAMj@UdAkA|GUlAeBhJq@tDoBlKQ|@Kb@On@ERGRM^Ob@k@fAU^a@h@e@j@w@`Ag@n@u@~@qAjBe@r@SZ[j@gAnBsAhCuAfCwAbCyKzQgE|GoJdOeBnCaBvCo@lAm@lAuAbDmBvEkApCkApDiAdDs@`C[hA[hAcArDcBdGkAbEUv@_@jA_@hAOb@Qd@Sd@Sf@Sh@Yl@[p@i@fAYh@oFhJi@dAWh@OZKXQh@qAzEaErNeB|FeH|UiArDe@rAm@xA_@r@ABCHGHU\\g@n@_FnGILmCbDe@l@STEHQTWb@Yf@KXITUr@Oh@Ib@Kd@Gf@Gb@Gr@?DG~@Cl@?@?l@@b@@`@Bb@Fp@^~CJ~@Dd@@ZBdA@Z?VAh@Ab@A`@C`@E`@E\\E\\G^ETERERENEFI^MZUn@Ob@Od@Wn@iA~Ca@lAQd@a@vAwBfHOh@Od@YbAENW|@K\\y@jCOb@_@tAOh@mAlE{AtFgBlG_@pAY|@Wn@EHa@fAOb@_@x@sA|Cg@fAgEtI[j@sAvCWj@s@vAOZS`@KXGVSt@Sx@e@tBOr@e@rBmBfJMl@[zAS~@w@fDUlA"},"start_location":{"lat":28.9164077,"lng":76.4634616},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"atimDmbgwMt@dIrCvABKtBa@u@xDn@h@^\\lFlCaA|AqAzHsArd@cClgA`Gtv@i@hFoBtDcBlDvCxIhLnb@nIdYtIlS~APpA}Ae@eC_GeB{KtNmI|RmF~I_IhDe\\`Tw[nV{BpPoK|MiUbO{IjLgBvHOtKlIj\\nPdm@?bLqB|KuUz\\aFnJBdPjBjEnEtEzC{Ak@mFgGvByAtE_CtMoF|JCzEjB|J@~TgGzOwGlJ{JpMmAjHdBvM_BbNSlDzAjGlSnW~LnI`GzGt@|`@s@`^`@lJ~H|ItZ|e@bBdRj@~O|QfBbAsBuAk@cBfAk@`DdAhDxCbCm@|f@|Afi@iBfm@qBbVcKpQsP~Js`A`e@od@fXqSpJaTzMs_@fj@{Gvr@gBlUoCtJ}IfLsLzIaPpL{IbCec@c@gp@hQouBpl@u\\rK}Ji@}a@u\\sNu@mEiD}F}GmHqIaB_@uHfNgEdQ_c@gDaAIg@vAyEjt@{Cfd@sJtyAmFtaAeHdoAoB`aAOjuBUvgAwAfbAqHpnBg]|pI{Ad]OlCdGNtTp@lLt@hMnBz\\bAhP`AnEjDvHf_@bk@njB@fMaCbHsWva@qRpj@ch@btAcK~RwJjGo|@l^_fAzb@kwAjm@uZzOqDjJuJ|XsOp]}Od[kEdNm]p}AeCnXqJ~SsExPWrQeG`U}ExIyDdCw[rHgKdH_JrLkEpMmHzr@gSjg@gO|Ssl@|v@{EvJyEf`@eFbRsMpYcL|U}FzFwTjDwY`FyHfLmWpi@{LlSoDxB{XdGc^xH{GzIwNta@ap@~gB_Wx`@cNvVyr@hbAcInDud@`NmJpEeHvOmXxcAgPnRoBnO`_@rvArE|UfCh~@X~_@yCpbGWdl@wBvP}RpjAaOjs@y[jfAo]pjAys@fpByj@zwA_m@pnAmUhc@}Xx`@__BxgBqYj]gc@bMu`@vMkIpE_LhKaE`JgIra@mEr^{Lf]st@leA}I|[k@f[sAfHcHlLqPzYeCzRv@|HlUlp@rXrjBpOd\\nKjTfBxRhAbj@eAr^{E`XyEbMeRl^aT|LcNrJyI|LiOjTgTra@wOtYsR|ZoPbf@mDhRtJxp@hXl`Bj@pIk@vGeCvHqElF}p@rd@eU~L_WdMg|@v[eRdJeEjH_Yxy@eGrUoI~`@{GxRqYv{@{Gfa@sVhs@uZ|}@_Hdf@sHnO{H`KaR|p@aKvr@eRp]kg@lUcG~FoB|ImTbkA{PrX{k@|`AwPbc@_Qhi@kM~XmWhz@{QbWoAfRN`UeLb^wP`l@qThg@uIda@"},"summary":"NH9","warnings":[],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJMRZhH_TlDDkRQXqtMEINWrg
         * types : ["street_address"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":29.0643148,"lng":77.3739903},"southwest":{"lat":28.5544229,"lng":76.0877631}}
         * copyrights : Map data ©2018 Google
         * legs : [{"distance":{"text":"161 km","value":161379},"duration":{"text":"3 hours 6 mins","value":11189},"end_address":"Haryana, India","end_location":{"lat":29.0643148,"lng":76.0877631},"start_address":"near balaji general store (bhoomiya mandir Room no 2, Baraula, Sector 49, Noida, Uttar Pradesh 201307, India","start_location":{"lat":28.5627292,"lng":77.3739903},"steps":[{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":962},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5575112,"lng":77.3282903},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tCXz@Vx@"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":480},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"mshmDyd~vMLb@Ld@dApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5575112,"lng":77.3282903},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5716},"duration":{"text":"9 mins","value":521},"end_location":{"lat":28.6099211,"lng":77.1392425},"html_instructions":"Keep <b>right<\/b> to continue on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>/<b>NH 48<\/b><div style=\"font-size:0.9em\">Continue to follow Mahatma Gandhi Marg/Ring Rd<\/div><div style=\"font-size:0.9em\">Pass by Dhaula Kuan Enclave I (on the left in 2.9&nbsp;km)<\/div>","maneuver":"keep-right","polyline":{"points":"_dlmDyw`vMcHlDiErBqOnHk@ZCBc@RA?CBm@V_D|AgKbFmCvAs@\\oAh@i@ToAp@kEjCaBbAkEbC{@d@kAl@eBdAgAp@oAt@a@XWPYT_@ViAp@OHQHWLgDjAeBn@iAd@_Aj@g@Z_CrAy@d@gDnBsDvBWPEBiC`BmBpAA@m@f@GDc@f@m@r@GFUX_@d@Y^o@~@SXeCpDkHlKc@l@oExGk@x@q@nAYp@[x@Qr@SdAUbC{@zKm@xGu@xJc@nGkApOQnCCTETCT[tAq@bC}@dCg@bAo@hAk@t@w@~@}@|@{@`AWTOLGHoDfCw@d@e@Xg@^WTs@l@"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"6.8 km","value":6810},"duration":{"text":"9 mins","value":553},"end_location":{"lat":28.6657009,"lng":77.1333743},"html_instructions":"Keep <b>left<\/b> to stay on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>","maneuver":"keep-left","polyline":{"points":"_{rmDggyuMi@d@qAjAeA|@[RwBnA}@n@y@n@q@d@kA|@wAx@{@Zm@Ny@N_@DI@_@BU@Y?e@Aq@Ea@As@C_AGc@Gi@CkB?{B@}DDmDC_AC_AC_A?[@]@e@FUDmAZuAZsDbAwA`@wA^}Bp@yDlAkBh@iCr@cAXyCz@e@LsCx@mCv@gFxAy@T[J{Ab@_AXSFmAZcD|@y@VmL|CmL|CSDYHUHc@Ja@LiHpBcElAYH}DnAaL~CKBWHQFcBh@qA\\{@ToBf@{Bl@cCv@aAXwJnCYHWFgC`ASFE@e@PC@m@Tm@ToA`@YLiA`@o@RSDSBSB[B_@@S@e@?a@COAYEWEYGOEOGQG[OCAEAKGIEGEGEIGOKe@[cA{@USYUa@]SOoC_CsDgD]Yo@m@{@u@YSMMOO]_@i@e@cA{@k@e@]WWOSMSKSKSEQEUA]Ce@?kEMaBEoAQICICICIGIGSOuAgAWUc@c@c@g@WYUUKOA?iAsA?ACAAACEA??AAAMOw@aAIKMOc@k@uAeBqBiCW["},"start_location":{"lat":28.6099211,"lng":77.1392425},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":170},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.6666874,"lng":77.13268769999999},"html_instructions":"Turn <b>left<\/b> toward <b>Rd Number 41<\/b>","maneuver":"turn-left","polyline":{"points":"sw}mDqbxuMG@I?ECGCc@g@ECEAA?SLMFqAdD"},"start_location":{"lat":28.6657009,"lng":77.1333743},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":504},"duration":{"text":"1 min","value":80},"end_location":{"lat":28.6688169,"lng":77.12824619999999},"html_instructions":"Continue onto <b>Rd Number 41<\/b><div style=\"font-size:0.9em\">Pass by the park (on the left in 350&nbsp;m)<\/div>","polyline":{"points":"y}}mDi~wuMIXKVGJ_@d@mA|Aq@dAe@x@cA|BeAdDa@~AGh@Eb@Cf@Gz@"},"start_location":{"lat":28.6666874,"lng":77.13268769999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":707},"duration":{"text":"3 mins","value":152},"end_location":{"lat":28.67505839999999,"lng":77.12909189999999},"html_instructions":"Turn <b>right<\/b> onto <b>S Manohar Singh Marg<\/b>/<b>North Ave<\/b><div style=\"font-size:0.9em\">Pass by Vijaya Bank (on the left in 600&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"ck~mDqbwuMANyBQuAIgBQw@GO?iAICA}@G_AGgAMkBQy@G_AI}BQcAGcAIOAq@G[E"},"start_location":{"lat":28.6688169,"lng":77.12824619999999},"travel_mode":"DRIVING"},{"distance":{"text":"17.2 km","value":17157},"duration":{"text":"33 mins","value":1984},"end_location":{"lat":28.6889251,"lng":76.9541955},"html_instructions":"Turn <b>left<\/b> onto <b>Rohtak Rd<\/b><div style=\"font-size:0.9em\">Pass by Metro Pillar Number 568 (on the right in 10.8&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"cr_nDygwuMK|AmA~Ra@lFATgBfXWbDK|Ak@lIe@vGUtDIrA?DEn@ATATEp@A\\KvAe@hHKvAInAWnDW~CeApPc@fGAL}@|MA@cAvPy@fOK~A[xEKbCCXAVCRIhBInBUdFCb@YjFMjBKnBKhBGr@CZKzBMlB_@zGYfGALKxBk@fKUxDYvEMfCQlCIdAY`EYtEEdAIdBSdEm@`JKbBIfAAb@Af@?N@h@@JCxKCtG?R?@A`@ClK?dH?XAX?J?~G@^?@?R?fB?bFAp@Cv@G|A?^?|@@z@?DJtE@jA@xA@hB?hA?nAChBChG?tCAfB?t@AnMEdG?hACrG?jKCrFCnH@dA?nBAh@AxAAl@?r@ArGCdD?vCA|C?jAA`B?l@ClKAdB@bBAnGCpBCpAK|CEv@CrACbAAVCd@E|@IhDQzEGjEm@`O_@dKEdAI|AIp@Md@[tDAL?LCj@?LAL?BAv@@v@BRB\\@T?VATYbHO|DEbAWzGC\\OhFAPK|BGjBKlCY`IGrAG~AKhCC|@UxFG|AGpAKdCWxGM~CGnACj@AXa@nK]nKCh@Ez@Cv@GdAEhAO|DEbAG|AGzAEt@StFEjA_@bIw@|SIjBm@jNOxCAf@]zIe@hLY`GG~BK~COzDCp@AXKdCGrAEjAAZMjCUtHG~AEjAc@~KMtCEb@a@lJAFS`EGfAAPMfBW|D_AfSE`AMzCIrBUjE"},"start_location":{"lat":28.67505839999999,"lng":77.12909189999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":732},"duration":{"text":"1 min","value":66},"end_location":{"lat":28.6896098,"lng":76.9467363},"html_instructions":"Continue straight onto <b>NH9<\/b>","maneuver":"straight","polyline":{"points":"yhbnDwbutM[~JEp@]pIStDc@jKIxAEr@"},"start_location":{"lat":28.6889251,"lng":76.9541955},"travel_mode":"DRIVING"},{"distance":{"text":"37.5 km","value":37544},"duration":{"text":"35 mins","value":2084},"end_location":{"lat":28.8449393,"lng":76.67692389999999},"html_instructions":"Turn <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Partial toll road<\/div><div style=\"font-size:0.9em\">Pass by Power Point (on the left)<\/div>","maneuver":"turn-left","polyline":{"points":"ambnDctstMv@?lENN@bCDbFP|HVfFNv@F`AHjAR`C`@vF|@LBF@B?@?`@DPBr@BhAD~@BzADpCJ`CF`GPjCH|CH~EP\\Bl@DVDNBPBd@LXJj@X\\RVRLJXVZb@NTJPLVNXJZHVDPDTFZRpAXfBf@tCnApHJf@Jh@ThANl@T`Af@pBj@jB`@xATz@~@bDbAxDb@`Bl@vBz@tCZbAhAnDp@tBf@xAjAnDlBtFdBjFdBdFDLDLHXjCvHbBbFn@lBf@~ALf@@BDPDV@HF\\DPF^DXBT@XBZ@^@`@?^?PA^?ZCh@CLE`@C\\EXETGVETERENABCHGPGRGPGLGLGNEJGJ]p@cB|CqA~BuAdCyAnCs@rAq@nAg@|@QZg@t@_@b@o@p@_@\\c@`@i@h@STSXW`@[n@KPWf@e@bAWh@]|@[z@]fASp@cC~Hc@tAs@~BY`Ay@nC_AzC_AvCg@vASj@Uj@_CnGcH|QiDpJmBjFwB`Gq@dBs@bBm@tAcA~By@fBeAtBEN{@dBaAxBQ\\w@hBcArBm@fAW^q@z@y@x@_@Zo@f@aAl@a@Rc@Tu@Zo@XaA`@iAd@mAf@_@Pw@ZaHtCeCbAcCbAaDpA_DpAYJWLiGfCeIbD_@NmBv@aG`CgA`@cAb@kClAsHnDs@\\s@Z{@\\oCdAYJYLy@Z}HxCkIxCwHvCm@TmCfAmGhCiFtBsBz@yAl@qFzBoBz@mD|AoAj@y@^eH~CuJfEw@Xw@Z{B`AuKvEyB~@uB~@mGrCWJWJgAh@WLm@ZOHi@\\]RYTMJOLQRWZS\\CDOVQ\\O^w@hBWdAW`AsAhFmA`Ek@bBgDlH}CxG}FzMo@xAgA`CSb@Sb@_AnBeE|H}C`Gk@fASb@Q`@MZMZo@~AM^Ut@Sn@Mf@y@~Cq@lCs@pCUz@oAlFy@fDa@fBOp@_@bB}@dE{BbK_CjKgA~EwCpNm@zC_@hBMr@Gh@CZCVGr@G`AMlBCf@QlCEp@Ef@Ir@Gh@EXG^Ib@K`@M^Un@]x@g@fAq@tAm@lAcAxBcBnDuAxCWp@Qj@c@`BMh@Ij@MfAI`AEf@Cn@CtA?jA?tC?hACn@EhAGt@AJMbA_@lBg@dBq@lBiA|Ci@zASj@]v@e@fAS`@?@[d@k@v@i@j@ON[Vo@f@OHKF_@PYLGBYJ_@Ja@He@Je@Ha@Hq@LgCViAPk@Li@LiAXkA\\wAb@uAf@o@Xm@XaB~@_@TKF}@l@uAjAOLg@d@aA~@aA~@e@j@c@h@s@jA?@g@t@u@xAg@lAKTm@`B]`AM\\[dAOp@Qr@_@bCe@zE]jDMvAw@rHg@`Fq@dHi@zEIn@_@tBMb@sAjDmAtCqAnCkC|FoEpJWd@KPCBEHu@fAgBdCeCbDuDdF_CfDcCfDoD`F_CdDuHdKMN_K|L{DpEED_BtBWd@Yl@Wl@EL_@tAETOdASjCYhE]|D[xBG\\]hB{@jE}@nEu@`Dq@zB_AtBcA|Be@|@c@~@eItQqBhEwAxCeClFsAjCw@lA}@bAoAfAw@`@MFeA`@m@Rq@LwDb@kEb@_CVwLjAoCZkATk@La@Ni@V{@b@OHMH_@Xc@^k@p@OTy@vAqBbEa@x@oAdCm@pAgA|BgA`CmCtFoC~F_EhIqCzF_B~Cs@nAQXa@f@WZWRq@n@o@f@a@Vy@b@c@T_A^_Bd@qDp@iNlC{MlCm@Jm@JcEr@eBb@aAZc@P[LYPc@Zm@f@e@j@GHeA`B]p@]z@Wv@}B~GgB~E}@jCGLuAtDCFyAdE_BpEaBnE{HxToCvHy@fCUj@sBtFyCnIWp@cBtEsDrK}ArEm@bBUf@_@p@cAbByIxMyAfC_BtC]l@_A~Ao@z@w@hAe@l@o@t@e@j@e@p@_AtAq@lA}@tBsBbFcAdBqG|IwErGaHbKwFnIqGpJyGpJm@f@[Va@^_@Te@X]N_@L_@LmA^o@RiDbAWHSHsDdAgDbA_GdBwDfAkEpAA?eCt@m@Vc@Tw@d@mAz@IHC@OLWTCDa@b@kAjBaAjCi@vB_@xAIXeAfEiDrMyFbU_DxNu@~BSd@oA~BA@_BlBwClD_D`DaA~@U\\Yb@[l@e@nA"},"start_location":{"lat":28.6896098,"lng":76.9467363},"travel_mode":"DRIVING"},{"distance":{"text":"24.1 km","value":24070},"duration":{"text":"20 mins","value":1191},"end_location":{"lat":28.9164077,"lng":76.4634616},"html_instructions":"Continue straight to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Sangam Dhaba (on the right in 18.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"{w`oDw}~rMYbA_@fBCZG|@Cv@?hA?v@Fr@Fp@Hr@Lh@Ll@h@lB`EzN~BtInAlEx@vCzBnIrAjEbB~FLf@Ld@dCpJbBxHbAtE`@hCHbA@Fb@`V~Ate@@h@@h@VlHD~BBpC?|BAfBCfBCfB[z[a@b^MnKC~AMjIGhIExMOng@ClIO`r@EfWAvG?vB?fD?z@AtA?tAE~HKl]E`ACn@GfAOxA{AdJgFj[a@jCKp@Id@e@xCG\\a@rBmGt]iAlGKf@_@dB_@dBkCdMcEnRMh@Mh@_CzI}AjF}@rCeC~HiAvDkAvDEL{IpYOh@c@vAkExNqE`OsAnEg@hB}@jCeDtKGRELENY|@IXq@pB]zAU~@y@xBs@`C{@fCa@zAcCdIi@fBgBpFqArDuAjDkFxMq@nBeHbQiD`JqClHg@pAgBvEcBhEgBpE}A|DKVITGNw@pB_BfEmBzEk@zAoAbDsE`LeAxCgArCyE|LsB~E}D`J_E`JgAvBuAdD_FnK[l@[l@oGnMi@z@EHkAnBELEHGH_FfJKRCFGLeCtEg@dA{E~IwB|DwAtCgBbDmB`DoB~CsB|Cw@lA{@lAwBtC}BtCaCpCaOjPkOfP}GpHkPtQcEvEmE~EaLxMsJjLsCxDeFdH_GjHa@j@ONo@n@}@n@w@b@y@^sFhB_Dz@gBh@oElAsItBUDWHcHbBgBd@gBd@_D~@y@Z}@\\_DtAiCvA"},"start_location":{"lat":28.8449393,"lng":76.67692389999999},"travel_mode":"DRIVING"},{"distance":{"text":"43.7 km","value":43729},"duration":{"text":"37 mins","value":2237},"end_location":{"lat":29.0643148,"lng":76.0877631},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Car And bike Insurance Point (on the right in 650&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"qvnoDsguqMaAh@KDc@Ve@RSHQJa@RkBjAaAj@c@ZgAt@s@n@q@r@_@b@sAbBW^OT[f@e@x@w@tAKVGPOl@Sz@i@xBk@lCg@fCi@tCk@`Dq@hDc@xB]fBiApG]zBMhAa@pDOfBOxBIfAK~@Mn@_@pBOh@iAdD{AbE}A|DiAdCo@lAiC`EaFjHeDdFaDnEgBnCoBlCsC|DcBxB{CbEoCnDu@~@a@f@QVa@l@g@v@oAxBs@vAi@pAYv@oAjDg@fBi@jCa@dCa@tCG|@K`BIhCEjCC`H?~@?t@Cx@IbAKr@YvAc@vAWr@cAhBmAhByBdD}BnDcAbBkArBiApByAhCkAtBYn@Yp@c@tAOd@UbAUjAOnAAPMpDEzA?Z@DAL@T?TJ|@TzARfATbAf@bBlDnKbCtFnBxEbClH~@pCh@dBpChMj@`IlG|f@rHbe@DXVlAH^J\\j@fBbA`DbDdH|FtJpIdP|@dC~@jFf@lKd@dS`@tT?N@V?rKMbHWzC_@~CkB~LoB`J}@xC{ChH_JdRwCxF_B~BMLOL_Ax@w@h@kBdAk@ZmDfBiB~@iB`AkBdAmBhAsA|@k@b@YTo@h@KJs@t@QP]`@i@l@a@h@{AfCy@jAKN{@lAc@r@}@vAaB`CkA`BeEzFOPQTQVOTaAtAgApBmD`GgBxC]hBsE|IEPc@z@gErIq@\\CByAxCu@~AiAxB[n@]r@[h@oEdH_AvAkCbE}A`Cc@r@[f@s@vAg@hAg@tA]bAkB`GoAzD_@bA]|@Wp@Wl@Sj@Ut@K\\IZQp@Qx@y@rC[lA]tAe@rBIh@CnAGx@@H?~AXpDbA|FdAdGdBbKfAnGPhAPdAf@nCrA~Gp@lEbAbGFf@Hl@|BbNhA|Gn@`ElAlHjAnHBJ@J~@`GhAlGBJ@J`@fCH~AA|AATEz@M~AUdBSdAUx@i@`Bq@tAcBbCYXq@n@a@^WRYRwSbOcD|BqIrFqIpF[TOLuA~@uA~@kBfAiBfAgCjAgC|@YRYP{@\\uExBmFrC_GxCcHrCiC|@g\\|LqQfGsKlEaDnBYNUVUTm@p@oAvBq@jBMZ}BfHaCvGwDdKoCfIkBzFgB|FUt@qBlH}AjFOl@Kb@EVCLEZId@UvAa@|BShAWlAm@nCaBfHk@jCo@lCSbAK^K^Yz@ABkA`DgAlC_AdCmAxCeBjEWn@Ul@Qf@Wt@_@rAiBhGuBjHs@`Cc@pAWr@sA|DaAtC_@fA_@fAk@bCo@xC[zBk@`EWfBm@lE[rBU`Aa@pAWr@cBrEo@hBgFzNaElLqBdGITk@zAMV?@[z@yFxP_BtEo@hBo@lBAB_FvNq@jB_@hAUt@Kf@A@Mp@QjAm@lEo@|ESxAm@bEu@fFq@nEEVEPIXGRELc@bA}@fBu@rA}B`Eg@z@EFILMT]b@q@x@mC~CWZSVSXMRMZUh@Md@}@vD{Lre@}@vD[dBS|A{A|LmAxJsA|JKj@IXENm@nAcFtJ}EbJ]p@c@r@c@d@IJQRa@Za@Z_EdBwAl@wIlDUHiBn@cCfAIBGDiCfAe@Xq@^g@Ve@X_@R_@Xi@^c@VsAzAMZIRILILS~@[tAEZKh@S|@G\\GVq@dDe@hCi@~Cs@|Da@zBYzAMj@UdAkA|GUlAeBhJq@tDoBlKQ|@Kb@On@ERGRM^Ob@k@fAU^a@h@e@j@w@`Ag@n@u@~@qAjBe@r@SZ[j@gAnBsAhCuAfCwAbCyKzQgE|GoJdOeBnCaBvCo@lAm@lAuAbDmBvEkApCkApDiAdDs@`C[hA[hAcArDcBdGkAbEUv@_@jA_@hAOb@Qd@Sd@Sf@Sh@Yl@[p@i@fAYh@oFhJi@dAWh@OZKXQh@qAzEaErNeB|FeH|UiArDe@rAm@xA_@r@ABCHGHU\\g@n@_FnGILmCbDe@l@STEHQTWb@Yf@KXITUr@Oh@Ib@Kd@Gf@Gb@Gr@?DG~@Cl@?@?l@@b@@`@Bb@Fp@^~CJ~@Dd@@ZBdA@Z?VAh@Ab@A`@C`@E`@E\\E\\G^ETERERENEFI^MZUn@Ob@Od@Wn@iA~Ca@lAQd@a@vAwBfHOh@Od@YbAENW|@K\\y@jCOb@_@tAOh@mAlE{AtFgBlG_@pAY|@Wn@EHa@fAOb@_@x@sA|Cg@fAgEtI[j@sAvCWj@s@vAOZS`@KXGVSt@Sx@e@tBOr@e@rBmBfJMl@[zAS~@w@fDUlA"},"start_location":{"lat":28.9164077,"lng":76.4634616},"travel_mode":"DRIVING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"atimDmbgwMt@dIrCvABKtBa@u@xDn@h@^\\lFlCaA|AqAzHsArd@cClgA`Gtv@i@hFoBtDcBlDvCxIhLnb@nIdYtIlS~APpA}Ae@eC_GeB{KtNmI|RmF~I_IhDe\\`Tw[nV{BpPoK|MiUbO{IjLgBvHOtKlIj\\nPdm@?bLqB|KuUz\\aFnJBdPjBjEnEtEzC{Ak@mFgGvByAtE_CtMoF|JCzEjB|J@~TgGzOwGlJ{JpMmAjHdBvM_BbNSlDzAjGlSnW~LnI`GzGt@|`@s@`^`@lJ~H|ItZ|e@bBdRj@~O|QfBbAsBuAk@cBfAk@`DdAhDxCbCm@|f@|Afi@iBfm@qBbVcKpQsP~Js`A`e@od@fXqSpJaTzMs_@fj@{Gvr@gBlUoCtJ}IfLsLzIaPpL{IbCec@c@gp@hQouBpl@u\\rK}Ji@}a@u\\sNu@mEiD}F}GmHqIaB_@uHfNgEdQ_c@gDaAIg@vAyEjt@{Cfd@sJtyAmFtaAeHdoAoB`aAOjuBUvgAwAfbAqHpnBg]|pI{Ad]OlCdGNtTp@lLt@hMnBz\\bAhP`AnEjDvHf_@bk@njB@fMaCbHsWva@qRpj@ch@btAcK~RwJjGo|@l^_fAzb@kwAjm@uZzOqDjJuJ|XsOp]}Od[kEdNm]p}AeCnXqJ~SsExPWrQeG`U}ExIyDdCw[rHgKdH_JrLkEpMmHzr@gSjg@gO|Ssl@|v@{EvJyEf`@eFbRsMpYcL|U}FzFwTjDwY`FyHfLmWpi@{LlSoDxB{XdGc^xH{GzIwNta@ap@~gB_Wx`@cNvVyr@hbAcInDud@`NmJpEeHvOmXxcAgPnRoBnO`_@rvArE|UfCh~@X~_@yCpbGWdl@wBvP}RpjAaOjs@y[jfAo]pjAys@fpByj@zwA_m@pnAmUhc@}Xx`@__BxgBqYj]gc@bMu`@vMkIpE_LhKaE`JgIra@mEr^{Lf]st@leA}I|[k@f[sAfHcHlLqPzYeCzRv@|HlUlp@rXrjBpOd\\nKjTfBxRhAbj@eAr^{E`XyEbMeRl^aT|LcNrJyI|LiOjTgTra@wOtYsR|ZoPbf@mDhRtJxp@hXl`Bj@pIk@vGeCvHqElF}p@rd@eU~L_WdMg|@v[eRdJeEjH_Yxy@eGrUoI~`@{GxRqYv{@{Gfa@sVhs@uZ|}@_Hdf@sHnO{H`KaR|p@aKvr@eRp]kg@lUcG~FoB|ImTbkA{PrX{k@|`AwPbc@_Qhi@kM~XmWhz@{QbWoAfRN`UeLb^wP`l@qThg@uIda@"}
         * summary : NH9
         * warnings : []
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<?> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<?> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<?> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":29.0643148,"lng":77.3739903}
             * southwest : {"lat":28.5544229,"lng":76.0877631}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 29.0643148
                 * lng : 77.3739903
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 28.5544229
                 * lng : 76.0877631
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class OverviewPolylineBean {
            /**
             * points : atimDmbgwMt@dIrCvABKtBa@u@xDn@h@^\lFlCaA|AqAzHsArd@cClgA`Gtv@i@hFoBtDcBlDvCxIhLnb@nIdYtIlS~APpA}Ae@eC_GeB{KtNmI|RmF~I_IhDe\`Tw[nV{BpPoK|MiUbO{IjLgBvHOtKlIj\nPdm@?bLqB|KuUz\aFnJBdPjBjEnEtEzC{Ak@mFgGvByAtE_CtMoF|JCzEjB|J@~TgGzOwGlJ{JpMmAjHdBvM_BbNSlDzAjGlSnW~LnI`GzGt@|`@s@`^`@lJ~H|ItZ|e@bBdRj@~O|QfBbAsBuAk@cBfAk@`DdAhDxCbCm@|f@|Afi@iBfm@qBbVcKpQsP~Js`A`e@od@fXqSpJaTzMs_@fj@{Gvr@gBlUoCtJ}IfLsLzIaPpL{IbCec@c@gp@hQouBpl@u\rK}Ji@}a@u\sNu@mEiD}F}GmHqIaB_@uHfNgEdQ_c@gDaAIg@vAyEjt@{Cfd@sJtyAmFtaAeHdoAoB`aAOjuBUvgAwAfbAqHpnBg]|pI{Ad]OlCdGNtTp@lLt@hMnBz\bAhP`AnEjDvHf_@bk@njB@fMaCbHsWva@qRpj@ch@btAcK~RwJjGo|@l^_fAzb@kwAjm@uZzOqDjJuJ|XsOp]}Od[kEdNm]p}AeCnXqJ~SsExPWrQeG`U}ExIyDdCw[rHgKdH_JrLkEpMmHzr@gSjg@gO|Ssl@|v@{EvJyEf`@eFbRsMpYcL|U}FzFwTjDwY`FyHfLmWpi@{LlSoDxB{XdGc^xH{GzIwNta@ap@~gB_Wx`@cNvVyr@hbAcInDud@`NmJpEeHvOmXxcAgPnRoBnO`_@rvArE|UfCh~@X~_@yCpbGWdl@wBvP}RpjAaOjs@y[jfAo]pjAys@fpByj@zwA_m@pnAmUhc@}Xx`@__BxgBqYj]gc@bMu`@vMkIpE_LhKaE`JgIra@mEr^{Lf]st@leA}I|[k@f[sAfHcHlLqPzYeCzRv@|HlUlp@rXrjBpOd\nKjTfBxRhAbj@eAr^{E`XyEbMeRl^aT|LcNrJyI|LiOjTgTra@wOtYsR|ZoPbf@mDhRtJxp@hXl`Bj@pIk@vGeCvHqElF}p@rd@eU~L_WdMg|@v[eRdJeEjH_Yxy@eGrUoI~`@{GxRqYv{@{Gfa@sVhs@uZ|}@_Hdf@sHnO{H`KaR|p@aKvr@eRp]kg@lUcG~FoB|ImTbkA{PrX{k@|`AwPbc@_Qhi@kM~XmWhz@{QbWoAfRN`UeLb^wP`l@qThg@uIda@
             */

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * distance : {"text":"161 km","value":161379}
             * duration : {"text":"3 hours 6 mins","value":11189}
             * end_address : Haryana, India
             * end_location : {"lat":29.0643148,"lng":76.0877631}
             * start_address : near balaji general store (bhoomiya mandir Room no 2, Baraula, Sector 49, Noida, Uttar Pradesh 201307, India
             * start_location : {"lat":28.5627292,"lng":77.3739903}
             * steps : [{"distance":{"text":"0.3 km","value":300},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5616428,"lng":77.3723012},"html_instructions":"Head <b>west<\/b>","polyline":{"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"},"start_location":{"lat":28.5627292,"lng":77.3739903},"travel_mode":"DRIVING"},{"distance":{"text":"61 m","value":61},"duration":{"text":"1 min","value":23},"end_location":{"lat":28.5611088,"lng":77.3721545},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"gmimD{wfwMhB\\"},"start_location":{"lat":28.5616428,"lng":77.3723012},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":96},"duration":{"text":"1 min","value":37},"end_location":{"lat":28.5613842,"lng":77.37122459999999},"html_instructions":"Turn <b>right<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"}iimD}vfwMCNq@hD"},"start_location":{"lat":28.5611088,"lng":77.3721545},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":196},"duration":{"text":"1 min","value":85},"end_location":{"lat":28.559862,"lng":77.3702292},"html_instructions":"Turn <b>left<\/b> toward <b>Dadri Main Rd<\/b>","maneuver":"turn-left","polyline":{"points":"skimDcqfwMFDFFDDXTHHJJFD@@LF`Ab@nCpA"},"start_location":{"lat":28.5613842,"lng":77.37122459999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":103},"duration":{"text":"1 min","value":44},"end_location":{"lat":28.5602486,"lng":77.36938049999999},"html_instructions":"Turn <b>right<\/b> onto <b>Dadri Main Rd<\/b>","maneuver":"turn-right","polyline":{"points":"cbimD}jfwMLNILIHU^Wd@Sl@EL"},"start_location":{"lat":28.559862,"lng":77.3702292},"travel_mode":"DRIVING"},{"distance":{"text":"1.2 km","value":1182},"duration":{"text":"3 mins","value":159},"end_location":{"lat":28.5612915,"lng":77.3573722},"html_instructions":"Continue straight to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 800&nbsp;m)<\/div>","maneuver":"straight","polyline":{"points":"qdimDsefwMGVOp@Qv@Ix@?TCl@?TAt@Bb@ALKdBMvBEn@C`BAVIdDIbCGtAGjA?TGdDAd@Ch@SpDM~CKhDQfK"},"start_location":{"lat":28.5602486,"lng":77.36938049999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":324},"duration":{"text":"1 min","value":27},"end_location":{"lat":28.561512,"lng":77.3540692},"html_instructions":"Continue straight past Indian Oil Petrol Pump to stay on <b>Dadri Main Rd<\/b>","maneuver":"straight","polyline":{"points":"akimDqzcwMANGtBKvBGjBMhH"},"start_location":{"lat":28.5612915,"lng":77.3573722},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":540},"duration":{"text":"1 min","value":43},"end_location":{"lat":28.5612479,"lng":77.3485965},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b>","maneuver":"keep-left","polyline":{"points":"mlimD}ecwMIvDUbGClA?h@DdAHpALtALrAj@nE"},"start_location":{"lat":28.561512,"lng":77.3540692},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":695},"duration":{"text":"1 min","value":83},"end_location":{"lat":28.5603155,"lng":77.3415799},"html_instructions":"Keep <b>left<\/b> to stay on <b>Dadri Main Rd<\/b><div style=\"font-size:0.9em\">Pass by Ashoka Mission Public School (on the left in 500&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"yjimDwcbwMfA~KJ`BDVFl@TdEXxCLrAR~BJnAB~@AXCp@Cb@"},"start_location":{"lat":28.5612479,"lng":77.3485965},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":332},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5615885,"lng":77.33863029999999},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Amrapali Marg<\/b>","polyline":{"points":"_eimD{w`wMNb@OhAQt@WdAQb@Sb@a@t@g@v@e@v@Q`@CHg@hA"},"start_location":{"lat":28.5603155,"lng":77.3415799},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":145},"duration":{"text":"1 min","value":33},"end_location":{"lat":28.560991,"lng":77.3373106},"html_instructions":"Turn <b>left<\/b> after Police Chowki Sector-37 (on the left)","maneuver":"turn-left","polyline":{"points":"}limDme`wMb@dB?@rA~C"},"start_location":{"lat":28.5615885,"lng":77.33863029999999},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":962},"duration":{"text":"1 min","value":89},"end_location":{"lat":28.5575112,"lng":77.3282903},"html_instructions":"Continue straight to stay on <b>Amrapali Marg<\/b><div style=\"font-size:0.9em\">Pass by Pearls Gateway Towers (on the left)<\/div>","maneuver":"straight","polyline":{"points":"eiimDe}_wM^pAz@rDLh@t@lCjAdExBfIBJX|@dAjDfB`GVz@z@tCXz@Vx@"},"start_location":{"lat":28.560991,"lng":77.3373106},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":480},"duration":{"text":"1 min","value":40},"end_location":{"lat":28.5555391,"lng":77.32392589999999},"html_instructions":"Continue onto <b>Maha Maya Flyover<\/b>","polyline":{"points":"mshmDyd~vMLb@Ld@dApDdAjDTv@Vt@`@hA`@hAl@pA`AjB"},"start_location":{"lat":28.5575112,"lng":77.3282903},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":824},"duration":{"text":"1 min","value":71},"end_location":{"lat":28.5584247,"lng":77.32195},"html_instructions":"Take the ramp onto <b>Noida-Greater Noida Expy<\/b>","polyline":{"points":"cghmDqi}vMl@`@PFJDLBTBJ?HAFAJEHCHGNKFIHMHUDQ@K@M?OCUCQEOKSOOYW_@UsAw@c@OUCU@WHIFIDKDOBy@fAwAzBeDlEc@n@Yb@INS\\u@dBIV"},"start_location":{"lat":28.5555391,"lng":77.32392589999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":664},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5622456,"lng":77.31706319999999},"html_instructions":"Keep <b>right<\/b> at the fork to continue on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"fork-right","polyline":{"points":"cyhmDe}|vMC?C@C@EBCDMR_@v@gAnCgAhCOb@EVE`@Sf@aBdDWb@ORQTWZSVQNURSLYPUL]Ny@ZmBp@"},"start_location":{"lat":28.5584247,"lng":77.32195},"travel_mode":"DRIVING"},{"distance":{"text":"1.1 km","value":1129},"duration":{"text":"2 mins","value":92},"end_location":{"lat":28.5708132,"lng":77.31088199999999},"html_instructions":"Keep <b>right<\/b> to stay on <b>Dadri Main Rd<\/b>/<b>Noida-Greater Noida Expy<\/b>","maneuver":"keep-right","polyline":{"points":"aqimDs~{vM_@HSL_CvAoCdB[R]VwAz@_@RMJGDA?CBIFIDe@\\MFkJnGkH~EuCnBgHvE"},"start_location":{"lat":28.5622456,"lng":77.31706319999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.6 km","value":599},"duration":{"text":"1 min","value":46},"end_location":{"lat":28.5732537,"lng":77.3056692},"html_instructions":"Take the exit toward <b>Delhi Noida Direct Flyway<\/b>","maneuver":"ramp-left","polyline":{"points":"qfkmD_xzvMINKNg@f@_@XMLMJIHGHGHGJGLEHCHCFAHEPEXC\\EbAEp@Eh@C\\G`@CVMx@Mn@Ol@Oj@GXYx@Wn@MZU^OXMRMNUVSPIDGB"},"start_location":{"lat":28.5708132,"lng":77.31088199999999},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4188},"duration":{"text":"4 mins","value":266},"end_location":{"lat":28.5806957,"lng":77.2698604},"html_instructions":"Continue onto <b>Delhi Noida Direct Flyway<\/b>","polyline":{"points":"yukmDmwyvMy@z@m@n@_@^_@Xi@^cAt@mA|@yB~AcAv@IFyEhCcAl@qAv@iAz@w@v@y@|@c@n@U\\]j@a@v@e@fAUl@Qh@?@Oj@Oj@ADG\\U`BGp@Gd@Cl@Ah@At@?|@BbABl@Fx@BXJz@?@?D@@?BNz@Rz@VdAl@nBnBdGZfADPv@~BhAfDdC~H|A|EzA|El@jBTv@Nl@Rz@J^FZJl@DVDZDf@DZDp@Dn@FpA?\\?d@?x@Cx@Cr@Et@Gp@MpAKn@Mp@Qv@On@Oj@Ob@Qh@Wv@Wh@Wl@]l@w@lAuAjBoMxO_AhAi@v@U^]n@Uj@Qf@Qh@I^Kb@G^Gj@APIjAA|@@Z?Z@`@B^?P@JDTDVF`@Np@DPDPH\\FRHVFPTn@"},"start_location":{"lat":28.5732537,"lng":77.3056692},"travel_mode":"DRIVING"},{"distance":{"text":"0.8 km","value":829},"duration":{"text":"1 min","value":64},"end_location":{"lat":28.5808515,"lng":77.2674227},"html_instructions":"Take the exit toward <b>NH 44<\/b>","maneuver":"ramp-left","polyline":{"points":"kdmmDswrvMd@ZrBbC\\b@NLHHJFHDDBFBBBJ@L@J@JAJALEHCNIFEDGJMBGDIFODOFQFUDW@W@UAWCOCMEOCGEGGIEGGGIIKEGCGCGAKCMAI?M@I@KBUHMFWL[RYRUV_@^S^EJKTGRITOf@IXGf@K|@I`BKpA"},"start_location":{"lat":28.5806957,"lng":77.2698604},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":334},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.5824884,"lng":77.2646055},"html_instructions":"Continue onto <b>NH 44<\/b><div style=\"font-size:0.9em\">Pass by Vidyut Vihar (on the left)<\/div>","polyline":{"points":"iemmDkhrvMEZMz@Ur@Ud@]p@]|@aAtAq@`A}@pAYd@"},"start_location":{"lat":28.5808515,"lng":77.2674227},"travel_mode":"DRIVING"},{"distance":{"text":"0.1 km","value":139},"duration":{"text":"1 min","value":14},"end_location":{"lat":28.5825355,"lng":77.2632689},"html_instructions":"Slight <b>left<\/b> onto the ramp to <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"qommDyvqvM?NANCNKZM\\EPCX?XF^Nh@FP"},"start_location":{"lat":28.5824884,"lng":77.2646055},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":155},"duration":{"text":"1 min","value":13},"end_location":{"lat":28.5820577,"lng":77.2618028},"html_instructions":"Keep <b>right<\/b> to continue toward <b>Baba Banda Singh Bahadur Setu<\/b>","maneuver":"keep-right","polyline":{"points":"{ommDmnqvMXr@b@rANl@H`@J`@Cj@"},"start_location":{"lat":28.5825355,"lng":77.2632689},"travel_mode":"DRIVING"},{"distance":{"text":"4.2 km","value":4167},"duration":{"text":"4 mins","value":265},"end_location":{"lat":28.5797971,"lng":77.2250677},"html_instructions":"Continue onto <b>Baba Banda Singh Bahadur Setu<\/b>","polyline":{"points":"{lmmDgeqvMFf@Bn@NpF?n@Aj@?fB?hBAj@Ct@E|@E^Kp@a@rBMb@Yx@_@v@e@v@eBfCaAvAo@|@q@~@kA~AINCBGHQX[b@Y`@U^gDbEc@d@a@j@u@fAKLQZOd@Qj@Ij@Eb@Ef@Cf@?\\@^Dp@Jv@PfARlATlAJv@Hp@@^@^?\\Cn@Ix@M`Aa@~Ae@xBKp@CX?DAJ?LAN?V?X@V@V@RJp@DTPl@Vj@Xd@Zd@nDtEj@x@?@TVBBNPBBBDd@f@d@d@vBrCfBzBv@`A|@lAz@`AVTNLb@Zf@Xf@RhDpAjAj@^Vb@^^`@T^Tb@Tf@Nh@Nj@Hn@Hn@@PD~@L|N?jGCtACvB?\\CbCEjDGvCO`GG`AE~@"},"start_location":{"lat":28.5820577,"lng":77.2618028},"travel_mode":"DRIVING"},{"distance":{"text":"1.8 km","value":1820},"duration":{"text":"2 mins","value":98},"end_location":{"lat":28.5727074,"lng":77.2093641},"html_instructions":"Continue onto <b>Prem Nagar Sewa Nagar Railway Under Bridge<\/b>","polyline":{"points":"w~lmDu_jvM?P?R?\\BvAFx@NvBBV@FRv@Pd@Zh@V^r@t@TNlBlAl@`@\\Tj@`@HHh@n@h@z@RZt@lAVd@Xd@LRlAxB`CzD`C|DdAhB~AnCjAvBZn@Ph@Nj@Lj@H~@BdAFlE@~A@t@@`@FfAHvGDr@BVFRBFDFDDFBLB"},"start_location":{"lat":28.5797971,"lng":77.2250677},"travel_mode":"DRIVING"},{"distance":{"text":"0.3 km","value":293},"duration":{"text":"1 min","value":28},"end_location":{"lat":28.5701027,"lng":77.2089325},"html_instructions":"Merge onto <b>Sri Aurobindo Marg<\/b>","maneuver":"merge","polyline":{"points":"mrkmDo}fvM^@t@HXDb@BzBNvBTRB@?l@F|@L"},"start_location":{"lat":28.5727074,"lng":77.2093641},"travel_mode":"DRIVING"},{"distance":{"text":"2.7 km","value":2676},"duration":{"text":"5 mins","value":287},"end_location":{"lat":28.5699516,"lng":77.1851248},"html_instructions":"Take the ramp onto <b>NH 48<\/b><div style=\"font-size:0.9em\">Pass by the gas station (on the right in 1.7&nbsp;km)<\/div>","polyline":{"points":"cbkmDyzfvMp@CJALCHELE?AFGBGBEBE@G@E@I?KAIAKCICGCEGIGGOGOCMAO@SDMDIDGBIFGFQPKNIPKRK`@CVCTAL?N?L?LBT@HBJHZJTZl@HNHHFJJHHFJDNDLBHDHDFDFFFFHJDFDHDJBNFXDZLb@GvAGvAGvAExACbAAdAAPObHC`AKdDEnAAx@AtABbADtA?TBlADlBBbAHrBRxERnFDx@Bb@D|@Bp@@n@?DBzA@f@?V?b@@`@A`DCtA?XCf@Cj@UhE]vFOzBSpDIrBAZA`@Aj@?DARAROzC"},"start_location":{"lat":28.5701027,"lng":77.2089325},"travel_mode":"DRIVING"},{"distance":{"text":"1.0 km","value":1007},"duration":{"text":"2 mins","value":123},"end_location":{"lat":28.5755242,"lng":77.1777316},"html_instructions":"Continue straight past Hyatt Regency Bus Stop to stay on <b>NH 48<\/b>","maneuver":"straight","polyline":{"points":"eakmD_fbvMG`AGpAAXO`BUhAMb@I^GZ?DAJAFADCHAFEDKTe@dAq@xAEHYl@MTKLu@rAw@lA{@fAk@n@WXa@^g@^a@TWL]TUNy@h@sAl@?@QHWLiAf@}@j@c@TgAf@"},"start_location":{"lat":28.5699516,"lng":77.1851248},"travel_mode":"DRIVING"},{"distance":{"text":"5.7 km","value":5716},"duration":{"text":"9 mins","value":521},"end_location":{"lat":28.6099211,"lng":77.1392425},"html_instructions":"Keep <b>right<\/b> to continue on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>/<b>NH 48<\/b><div style=\"font-size:0.9em\">Continue to follow Mahatma Gandhi Marg/Ring Rd<\/div><div style=\"font-size:0.9em\">Pass by Dhaula Kuan Enclave I (on the left in 2.9&nbsp;km)<\/div>","maneuver":"keep-right","polyline":{"points":"_dlmDyw`vMcHlDiErBqOnHk@ZCBc@RA?CBm@V_D|AgKbFmCvAs@\\oAh@i@ToAp@kEjCaBbAkEbC{@d@kAl@eBdAgAp@oAt@a@XWPYT_@ViAp@OHQHWLgDjAeBn@iAd@_Aj@g@Z_CrAy@d@gDnBsDvBWPEBiC`BmBpAA@m@f@GDc@f@m@r@GFUX_@d@Y^o@~@SXeCpDkHlKc@l@oExGk@x@q@nAYp@[x@Qr@SdAUbC{@zKm@xGu@xJc@nGkApOQnCCTETCT[tAq@bC}@dCg@bAo@hAk@t@w@~@}@|@{@`AWTOLGHoDfCw@d@e@Xg@^WTs@l@"},"start_location":{"lat":28.5755242,"lng":77.1777316},"travel_mode":"DRIVING"},{"distance":{"text":"6.8 km","value":6810},"duration":{"text":"9 mins","value":553},"end_location":{"lat":28.6657009,"lng":77.1333743},"html_instructions":"Keep <b>left<\/b> to stay on <b>Mahatma Gandhi Marg<\/b>/<b>Ring Rd<\/b>","maneuver":"keep-left","polyline":{"points":"_{rmDggyuMi@d@qAjAeA|@[RwBnA}@n@y@n@q@d@kA|@wAx@{@Zm@Ny@N_@DI@_@BU@Y?e@Aq@Ea@As@C_AGc@Gi@CkB?{B@}DDmDC_AC_AC_A?[@]@e@FUDmAZuAZsDbAwA`@wA^}Bp@yDlAkBh@iCr@cAXyCz@e@LsCx@mCv@gFxAy@T[J{Ab@_AXSFmAZcD|@y@VmL|CmL|CSDYHUHc@Ja@LiHpBcElAYH}DnAaL~CKBWHQFcBh@qA\\{@ToBf@{Bl@cCv@aAXwJnCYHWFgC`ASFE@e@PC@m@Tm@ToA`@YLiA`@o@RSDSBSB[B_@@S@e@?a@COAYEWEYGOEOGQG[OCAEAKGIEGEGEIGOKe@[cA{@USYUa@]SOoC_CsDgD]Yo@m@{@u@YSMMOO]_@i@e@cA{@k@e@]WWOSMSKSKSEQEUA]Ce@?kEMaBEoAQICICICIGIGSOuAgAWUc@c@c@g@WYUUKOA?iAsA?ACAAACEA??AAAMOw@aAIKMOc@k@uAeBqBiCW["},"start_location":{"lat":28.6099211,"lng":77.1392425},"travel_mode":"DRIVING"},{"distance":{"text":"0.2 km","value":170},"duration":{"text":"1 min","value":29},"end_location":{"lat":28.6666874,"lng":77.13268769999999},"html_instructions":"Turn <b>left<\/b> toward <b>Rd Number 41<\/b>","maneuver":"turn-left","polyline":{"points":"sw}mDqbxuMG@I?ECGCc@g@ECEAA?SLMFqAdD"},"start_location":{"lat":28.6657009,"lng":77.1333743},"travel_mode":"DRIVING"},{"distance":{"text":"0.5 km","value":504},"duration":{"text":"1 min","value":80},"end_location":{"lat":28.6688169,"lng":77.12824619999999},"html_instructions":"Continue onto <b>Rd Number 41<\/b><div style=\"font-size:0.9em\">Pass by the park (on the left in 350&nbsp;m)<\/div>","polyline":{"points":"y}}mDi~wuMIXKVGJ_@d@mA|Aq@dAe@x@cA|BeAdDa@~AGh@Eb@Cf@Gz@"},"start_location":{"lat":28.6666874,"lng":77.13268769999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":707},"duration":{"text":"3 mins","value":152},"end_location":{"lat":28.67505839999999,"lng":77.12909189999999},"html_instructions":"Turn <b>right<\/b> onto <b>S Manohar Singh Marg<\/b>/<b>North Ave<\/b><div style=\"font-size:0.9em\">Pass by Vijaya Bank (on the left in 600&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"ck~mDqbwuMANyBQuAIgBQw@GO?iAICA}@G_AGgAMkBQy@G_AI}BQcAGcAIOAq@G[E"},"start_location":{"lat":28.6688169,"lng":77.12824619999999},"travel_mode":"DRIVING"},{"distance":{"text":"17.2 km","value":17157},"duration":{"text":"33 mins","value":1984},"end_location":{"lat":28.6889251,"lng":76.9541955},"html_instructions":"Turn <b>left<\/b> onto <b>Rohtak Rd<\/b><div style=\"font-size:0.9em\">Pass by Metro Pillar Number 568 (on the right in 10.8&nbsp;km)<\/div>","maneuver":"turn-left","polyline":{"points":"cr_nDygwuMK|AmA~Ra@lFATgBfXWbDK|Ak@lIe@vGUtDIrA?DEn@ATATEp@A\\KvAe@hHKvAInAWnDW~CeApPc@fGAL}@|MA@cAvPy@fOK~A[xEKbCCXAVCRIhBInBUdFCb@YjFMjBKnBKhBGr@CZKzBMlB_@zGYfGALKxBk@fKUxDYvEMfCQlCIdAY`EYtEEdAIdBSdEm@`JKbBIfAAb@Af@?N@h@@JCxKCtG?R?@A`@ClK?dH?XAX?J?~G@^?@?R?fB?bFAp@Cv@G|A?^?|@@z@?DJtE@jA@xA@hB?hA?nAChBChG?tCAfB?t@AnMEdG?hACrG?jKCrFCnH@dA?nBAh@AxAAl@?r@ArGCdD?vCA|C?jAA`B?l@ClKAdB@bBAnGCpBCpAK|CEv@CrACbAAVCd@E|@IhDQzEGjEm@`O_@dKEdAI|AIp@Md@[tDAL?LCj@?LAL?BAv@@v@BRB\\@T?VATYbHO|DEbAWzGC\\OhFAPK|BGjBKlCY`IGrAG~AKhCC|@UxFG|AGpAKdCWxGM~CGnACj@AXa@nK]nKCh@Ez@Cv@GdAEhAO|DEbAG|AGzAEt@StFEjA_@bIw@|SIjBm@jNOxCAf@]zIe@hLY`GG~BK~COzDCp@AXKdCGrAEjAAZMjCUtHG~AEjAc@~KMtCEb@a@lJAFS`EGfAAPMfBW|D_AfSE`AMzCIrBUjE"},"start_location":{"lat":28.67505839999999,"lng":77.12909189999999},"travel_mode":"DRIVING"},{"distance":{"text":"0.7 km","value":732},"duration":{"text":"1 min","value":66},"end_location":{"lat":28.6896098,"lng":76.9467363},"html_instructions":"Continue straight onto <b>NH9<\/b>","maneuver":"straight","polyline":{"points":"yhbnDwbutM[~JEp@]pIStDc@jKIxAEr@"},"start_location":{"lat":28.6889251,"lng":76.9541955},"travel_mode":"DRIVING"},{"distance":{"text":"37.5 km","value":37544},"duration":{"text":"35 mins","value":2084},"end_location":{"lat":28.8449393,"lng":76.67692389999999},"html_instructions":"Turn <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Partial toll road<\/div><div style=\"font-size:0.9em\">Pass by Power Point (on the left)<\/div>","maneuver":"turn-left","polyline":{"points":"ambnDctstMv@?lENN@bCDbFP|HVfFNv@F`AHjAR`C`@vF|@LBF@B?@?`@DPBr@BhAD~@BzADpCJ`CF`GPjCH|CH~EP\\Bl@DVDNBPBd@LXJj@X\\RVRLJXVZb@NTJPLVNXJZHVDPDTFZRpAXfBf@tCnApHJf@Jh@ThANl@T`Af@pBj@jB`@xATz@~@bDbAxDb@`Bl@vBz@tCZbAhAnDp@tBf@xAjAnDlBtFdBjFdBdFDLDLHXjCvHbBbFn@lBf@~ALf@@BDPDV@HF\\DPF^DXBT@XBZ@^@`@?^?PA^?ZCh@CLE`@C\\EXETGVETERENABCHGPGRGPGLGLGNEJGJ]p@cB|CqA~BuAdCyAnCs@rAq@nAg@|@QZg@t@_@b@o@p@_@\\c@`@i@h@STSXW`@[n@KPWf@e@bAWh@]|@[z@]fASp@cC~Hc@tAs@~BY`Ay@nC_AzC_AvCg@vASj@Uj@_CnGcH|QiDpJmBjFwB`Gq@dBs@bBm@tAcA~By@fBeAtBEN{@dBaAxBQ\\w@hBcArBm@fAW^q@z@y@x@_@Zo@f@aAl@a@Rc@Tu@Zo@XaA`@iAd@mAf@_@Pw@ZaHtCeCbAcCbAaDpA_DpAYJWLiGfCeIbD_@NmBv@aG`CgA`@cAb@kClAsHnDs@\\s@Z{@\\oCdAYJYLy@Z}HxCkIxCwHvCm@TmCfAmGhCiFtBsBz@yAl@qFzBoBz@mD|AoAj@y@^eH~CuJfEw@Xw@Z{B`AuKvEyB~@uB~@mGrCWJWJgAh@WLm@ZOHi@\\]RYTMJOLQRWZS\\CDOVQ\\O^w@hBWdAW`AsAhFmA`Ek@bBgDlH}CxG}FzMo@xAgA`CSb@Sb@_AnBeE|H}C`Gk@fASb@Q`@MZMZo@~AM^Ut@Sn@Mf@y@~Cq@lCs@pCUz@oAlFy@fDa@fBOp@_@bB}@dE{BbK_CjKgA~EwCpNm@zC_@hBMr@Gh@CZCVGr@G`AMlBCf@QlCEp@Ef@Ir@Gh@EXG^Ib@K`@M^Un@]x@g@fAq@tAm@lAcAxBcBnDuAxCWp@Qj@c@`BMh@Ij@MfAI`AEf@Cn@CtA?jA?tC?hACn@EhAGt@AJMbA_@lBg@dBq@lBiA|Ci@zASj@]v@e@fAS`@?@[d@k@v@i@j@ON[Vo@f@OHKF_@PYLGBYJ_@Ja@He@Je@Ha@Hq@LgCViAPk@Li@LiAXkA\\wAb@uAf@o@Xm@XaB~@_@TKF}@l@uAjAOLg@d@aA~@aA~@e@j@c@h@s@jA?@g@t@u@xAg@lAKTm@`B]`AM\\[dAOp@Qr@_@bCe@zE]jDMvAw@rHg@`Fq@dHi@zEIn@_@tBMb@sAjDmAtCqAnCkC|FoEpJWd@KPCBEHu@fAgBdCeCbDuDdF_CfDcCfDoD`F_CdDuHdKMN_K|L{DpEED_BtBWd@Yl@Wl@EL_@tAETOdASjCYhE]|D[xBG\\]hB{@jE}@nEu@`Dq@zB_AtBcA|Be@|@c@~@eItQqBhEwAxCeClFsAjCw@lA}@bAoAfAw@`@MFeA`@m@Rq@LwDb@kEb@_CVwLjAoCZkATk@La@Ni@V{@b@OHMH_@Xc@^k@p@OTy@vAqBbEa@x@oAdCm@pAgA|BgA`CmCtFoC~F_EhIqCzF_B~Cs@nAQXa@f@WZWRq@n@o@f@a@Vy@b@c@T_A^_Bd@qDp@iNlC{MlCm@Jm@JcEr@eBb@aAZc@P[LYPc@Zm@f@e@j@GHeA`B]p@]z@Wv@}B~GgB~E}@jCGLuAtDCFyAdE_BpEaBnE{HxToCvHy@fCUj@sBtFyCnIWp@cBtEsDrK}ArEm@bBUf@_@p@cAbByIxMyAfC_BtC]l@_A~Ao@z@w@hAe@l@o@t@e@j@e@p@_AtAq@lA}@tBsBbFcAdBqG|IwErGaHbKwFnIqGpJyGpJm@f@[Va@^_@Te@X]N_@L_@LmA^o@RiDbAWHSHsDdAgDbA_GdBwDfAkEpAA?eCt@m@Vc@Tw@d@mAz@IHC@OLWTCDa@b@kAjBaAjCi@vB_@xAIXeAfEiDrMyFbU_DxNu@~BSd@oA~BA@_BlBwClD_D`DaA~@U\\Yb@[l@e@nA"},"start_location":{"lat":28.6896098,"lng":76.9467363},"travel_mode":"DRIVING"},{"distance":{"text":"24.1 km","value":24070},"duration":{"text":"20 mins","value":1191},"end_location":{"lat":28.9164077,"lng":76.4634616},"html_instructions":"Continue straight to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Sangam Dhaba (on the right in 18.3&nbsp;km)<\/div>","maneuver":"straight","polyline":{"points":"{w`oDw}~rMYbA_@fBCZG|@Cv@?hA?v@Fr@Fp@Hr@Lh@Ll@h@lB`EzN~BtInAlEx@vCzBnIrAjEbB~FLf@Ld@dCpJbBxHbAtE`@hCHbA@Fb@`V~Ate@@h@@h@VlHD~BBpC?|BAfBCfBCfB[z[a@b^MnKC~AMjIGhIExMOng@ClIO`r@EfWAvG?vB?fD?z@AtA?tAE~HKl]E`ACn@GfAOxA{AdJgFj[a@jCKp@Id@e@xCG\\a@rBmGt]iAlGKf@_@dB_@dBkCdMcEnRMh@Mh@_CzI}AjF}@rCeC~HiAvDkAvDEL{IpYOh@c@vAkExNqE`OsAnEg@hB}@jCeDtKGRELENY|@IXq@pB]zAU~@y@xBs@`C{@fCa@zAcCdIi@fBgBpFqArDuAjDkFxMq@nBeHbQiD`JqClHg@pAgBvEcBhEgBpE}A|DKVITGNw@pB_BfEmBzEk@zAoAbDsE`LeAxCgArCyE|LsB~E}D`J_E`JgAvBuAdD_FnK[l@[l@oGnMi@z@EHkAnBELEHGH_FfJKRCFGLeCtEg@dA{E~IwB|DwAtCgBbDmB`DoB~CsB|Cw@lA{@lAwBtC}BtCaCpCaOjPkOfP}GpHkPtQcEvEmE~EaLxMsJjLsCxDeFdH_GjHa@j@ONo@n@}@n@w@b@y@^sFhB_Dz@gBh@oElAsItBUDWHcHbBgBd@gBd@_D~@y@Z}@\\_DtAiCvA"},"start_location":{"lat":28.8449393,"lng":76.67692389999999},"travel_mode":"DRIVING"},{"distance":{"text":"43.7 km","value":43729},"duration":{"text":"37 mins","value":2237},"end_location":{"lat":29.0643148,"lng":76.0877631},"html_instructions":"Keep <b>left<\/b> to stay on <b>NH9<\/b><div style=\"font-size:0.9em\">Pass by Car And bike Insurance Point (on the right in 650&nbsp;m)<\/div>","maneuver":"keep-left","polyline":{"points":"qvnoDsguqMaAh@KDc@Ve@RSHQJa@RkBjAaAj@c@ZgAt@s@n@q@r@_@b@sAbBW^OT[f@e@x@w@tAKVGPOl@Sz@i@xBk@lCg@fCi@tCk@`Dq@hDc@xB]fBiApG]zBMhAa@pDOfBOxBIfAK~@Mn@_@pBOh@iAdD{AbE}A|DiAdCo@lAiC`EaFjHeDdFaDnEgBnCoBlCsC|DcBxB{CbEoCnDu@~@a@f@QVa@l@g@v@oAxBs@vAi@pAYv@oAjDg@fBi@jCa@dCa@tCG|@K`BIhCEjCC`H?~@?t@Cx@IbAKr@YvAc@vAWr@cAhBmAhByBdD}BnDcAbBkArBiApByAhCkAtBYn@Yp@c@tAOd@UbAUjAOnAAPMpDEzA?Z@DAL@T?TJ|@TzARfATbAf@bBlDnKbCtFnBxEbClH~@pCh@dBpChMj@`IlG|f@rHbe@DXVlAH^J\\j@fBbA`DbDdH|FtJpIdP|@dC~@jFf@lKd@dS`@tT?N@V?rKMbHWzC_@~CkB~LoB`J}@xC{ChH_JdRwCxF_B~BMLOL_Ax@w@h@kBdAk@ZmDfBiB~@iB`AkBdAmBhAsA|@k@b@YTo@h@KJs@t@QP]`@i@l@a@h@{AfCy@jAKN{@lAc@r@}@vAaB`CkA`BeEzFOPQTQVOTaAtAgApBmD`GgBxC]hBsE|IEPc@z@gErIq@\\CByAxCu@~AiAxB[n@]r@[h@oEdH_AvAkCbE}A`Cc@r@[f@s@vAg@hAg@tA]bAkB`GoAzD_@bA]|@Wp@Wl@Sj@Ut@K\\IZQp@Qx@y@rC[lA]tAe@rBIh@CnAGx@@H?~AXpDbA|FdAdGdBbKfAnGPhAPdAf@nCrA~Gp@lEbAbGFf@Hl@|BbNhA|Gn@`ElAlHjAnHBJ@J~@`GhAlGBJ@J`@fCH~AA|AATEz@M~AUdBSdAUx@i@`Bq@tAcBbCYXq@n@a@^WRYRwSbOcD|BqIrFqIpF[TOLuA~@uA~@kBfAiBfAgCjAgC|@YRYP{@\\uExBmFrC_GxCcHrCiC|@g\\|LqQfGsKlEaDnBYNUVUTm@p@oAvBq@jBMZ}BfHaCvGwDdKoCfIkBzFgB|FUt@qBlH}AjFOl@Kb@EVCLEZId@UvAa@|BShAWlAm@nCaBfHk@jCo@lCSbAK^K^Yz@ABkA`DgAlC_AdCmAxCeBjEWn@Ul@Qf@Wt@_@rAiBhGuBjHs@`Cc@pAWr@sA|DaAtC_@fA_@fAk@bCo@xC[zBk@`EWfBm@lE[rBU`Aa@pAWr@cBrEo@hBgFzNaElLqBdGITk@zAMV?@[z@yFxP_BtEo@hBo@lBAB_FvNq@jB_@hAUt@Kf@A@Mp@QjAm@lEo@|ESxAm@bEu@fFq@nEEVEPIXGRELc@bA}@fBu@rA}B`Eg@z@EFILMT]b@q@x@mC~CWZSVSXMRMZUh@Md@}@vD{Lre@}@vD[dBS|A{A|LmAxJsA|JKj@IXENm@nAcFtJ}EbJ]p@c@r@c@d@IJQRa@Za@Z_EdBwAl@wIlDUHiBn@cCfAIBGDiCfAe@Xq@^g@Ve@X_@R_@Xi@^c@VsAzAMZIRILILS~@[tAEZKh@S|@G\\GVq@dDe@hCi@~Cs@|Da@zBYzAMj@UdAkA|GUlAeBhJq@tDoBlKQ|@Kb@On@ERGRM^Ob@k@fAU^a@h@e@j@w@`Ag@n@u@~@qAjBe@r@SZ[j@gAnBsAhCuAfCwAbCyKzQgE|GoJdOeBnCaBvCo@lAm@lAuAbDmBvEkApCkApDiAdDs@`C[hA[hAcArDcBdGkAbEUv@_@jA_@hAOb@Qd@Sd@Sf@Sh@Yl@[p@i@fAYh@oFhJi@dAWh@OZKXQh@qAzEaErNeB|FeH|UiArDe@rAm@xA_@r@ABCHGHU\\g@n@_FnGILmCbDe@l@STEHQTWb@Yf@KXITUr@Oh@Ib@Kd@Gf@Gb@Gr@?DG~@Cl@?@?l@@b@@`@Bb@Fp@^~CJ~@Dd@@ZBdA@Z?VAh@Ab@A`@C`@E`@E\\E\\G^ETERERENEFI^MZUn@Ob@Od@Wn@iA~Ca@lAQd@a@vAwBfHOh@Od@YbAENW|@K\\y@jCOb@_@tAOh@mAlE{AtFgBlG_@pAY|@Wn@EHa@fAOb@_@x@sA|Cg@fAgEtI[j@sAvCWj@s@vAOZS`@KXGVSt@Sx@e@tBOr@e@rBmBfJMl@[zAS~@w@fDUlA"},"start_location":{"lat":28.9164077,"lng":76.4634616},"travel_mode":"DRIVING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBean> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBean> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBean> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class DistanceBean {
                /**
                 * text : 161 km
                 * value : 161379
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 3 hours 6 mins
                 * value : 11189
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 29.0643148
                 * lng : 76.0877631
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 28.5627292
                 * lng : 77.3739903
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBean {
                /**
                 * distance : {"text":"0.3 km","value":300}
                 * duration : {"text":"2 mins","value":98}
                 * end_location : {"lat":28.5616428,"lng":77.3723012}
                 * html_instructions : Head <b>west</b>
                 * polyline : {"points":"atimDmbgwM@PDp@BfB@F@JB\\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A"}
                 * start_location : {"lat":28.5627292,"lng":77.3739903}
                 * travel_mode : DRIVING
                 * maneuver : turn-right
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private String maneuver;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public String getManeuver() {
                    return maneuver;
                }

                public void setManeuver(String maneuver) {
                    this.maneuver = maneuver;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 0.3 km
                     * value : 300
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 2 mins
                     * value : 98
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 28.5616428
                     * lng : 77.3723012
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : atimDmbgwM@PDp@BfB@F@JB\BPJp@@F@BBF@@@B@@BB?B@BBHBDDDDDHBL?RDRJj@^B@B@B@@?@A@A?A@A?E@AJ_A
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 28.5627292
                     * lng : 77.3739903
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }
    }
}
