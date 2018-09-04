package com.letulet.backend.model;

/**
 * Created by stephan on 09/11/17.
 */
public enum Currency {
    USD,
    EUR,
    GBP,
    CAD,
    JPY,
    INR,
    MYR,
    AUD,
    MXN,
    HKD,
    NZD,
    CHF,
    BRL,
    CLP,
    COP,
    PEN,
    ARS,
    UYU,
    VEF,
    CNY,
    THB,
    KRW,
    IDR,
    SGD,
    TWD,
    AED;

    public String getCurrencySymbol() {
        switch(this) {
        case USD: return "$";
        case EUR: return "\u20AC";
        case GBP: return "\u00A3";
        case CAD: return "\u0024";
        case JPY: return "\u00A5";
        case INR: return "\u20B9";
        case MYR: return "\u0052\u004d";
        case AUD: return "\u0024";
        case MXN: return "Mex$";
        case HKD: return "\u0024";
        case NZD: return "\u0024";
        case CHF: return "\u0043\u0048\u0046";
        case BRL: return "\u0052\u0024";
        case CLP: return "\u0024";
        case COP: return "\u0024";
        case PEN: return "\u0053\u002f\u002e";
        case ARS: return "\u0024";
        case UYU: return "\u0024\u0055";
        case VEF: return "\u0042\u0073";
        case CNY: return "\u00a5";
        case THB: return "\u0E3F";
        case KRW: return "\u20A9";
        case IDR: return "\u0052\u0070";
        case SGD: return "\u0024";
        case AED: return "\u062f\u002e\u0625";
        case TWD: return "\u004E\u0054\u0024";

        default:
            throw new RuntimeException("Unrecognized Currency");
        }
    }
}

