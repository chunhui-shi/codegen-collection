
package org.apache.drill.exec.test.generated;

import org.apache.drill.exec.exception.SchemaChangeException;
import org.apache.drill.exec.expr.holders.BigIntHolder;
import org.apache.drill.exec.expr.holders.Float8Holder;
import org.apache.drill.exec.expr.holders.NullableFloat8Holder;
import org.apache.drill.exec.physical.impl.aggregate.HashAggTemplate;
import org.apache.drill.exec.record.RecordBatch;
import org.apache.drill.exec.record.VectorContainer;
import org.apache.drill.exec.vector.BigIntVector;
import org.apache.drill.exec.vector.Float8Vector;
import org.apache.drill.exec.vector.NullableFloat8Vector;

public class HashAggregatorGen9
    extends HashAggTemplate
{


    public HashAggregatorGen9() {
        try {
            __DRILL_INIT__();
        } catch (SchemaChangeException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    protected HashAggTemplate.BatchHolder newBatchHolder(int arg1) {
        return new HashAggregatorGen9 .BatchHolder(arg1);
    }

    public void doSetup(RecordBatch incoming)
        throws SchemaChangeException
    {
    }

    public int getVectorIndex(int recordIndex)
        throws SchemaChangeException
    {
        {
            return (recordIndex);
        }
    }

    public boolean resetValues()
        throws SchemaChangeException
    {
        {
            return true;
        }
    }

    public void __DRILL_INIT__()
        throws SchemaChangeException
    {
    }

    private final class BatchHolder
        extends HashAggTemplate.BatchHolder
    {

        Float8Holder work0;
        Float8Vector vv1;
        BigIntHolder work4;
        BigIntVector vv5;
        Float8Vector vv8;
        NullableFloat8Vector vv13;

        public BatchHolder(int arg1) {
            super(arg1);
            try {
                __DRILL_INIT__();
            } catch (SchemaChangeException e) {
                throw new UnsupportedOperationException(e);
            }
        }

        public void outputRecordValues(int htRowIdx, int outRowIdx)
            throws SchemaChangeException
        {
            {
                NullableFloat8Holder out12;
                {
                    final NullableFloat8Holder out = new NullableFloat8Holder();
                    work0 .value = vv1 .getAccessor().get((htRowIdx));
                    Float8Holder value = work0;
                    work4 .value = vv5 .getAccessor().get((htRowIdx));
                    BigIntHolder nonNullCount = work4;
                     
SumFunctions$Float8Sum_output: {
    if (nonNullCount.value > 0) {
        out.value = value.value;
        out.isSet = 1;
    } else
    {
        out.isSet = 0;
    }
}
 
                    work0 = value;
                    vv1 .getMutator().set((htRowIdx), work0 .value);
                    work4 = nonNullCount;
                    vv5 .getMutator().set((htRowIdx), work4 .value);
                    out12 = out;
                }
                if (!(out12 .isSet == 0)) {
                    vv13 .getMutator().setSafe((outRowIdx), out12 .isSet, out12 .value);
                }
            }
        }

        public void setupInterior(RecordBatch incoming, RecordBatch outgoing, VectorContainer aggrValuesContainer)
            throws SchemaChangeException
        {
            {
                int[] fieldIds2 = new int[ 1 ] ;
                fieldIds2 [ 0 ] = 0;
                Object tmp3 = (aggrValuesContainer).getValueAccessorById(Float8Vector.class, fieldIds2).getValueVector();
                if (tmp3 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv1 with id: TypedFieldId [fieldIds=[0], remainder=null].");
                }
                vv1 = ((Float8Vector) tmp3);
                int[] fieldIds6 = new int[ 1 ] ;
                fieldIds6 [ 0 ] = 1;
                Object tmp7 = (aggrValuesContainer).getValueAccessorById(BigIntVector.class, fieldIds6).getValueVector();
                if (tmp7 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv5 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv5 = ((BigIntVector) tmp7);
                int vectorSize = 2147483647;
                vectorSize = Math.min(vectorSize, vv1 .getValueCapacity());
                vectorSize = Math.min(vectorSize, vv5 .getValueCapacity());
                work0 = new Float8Holder();
                work4 = new BigIntHolder();
                for (int drill_internal_i = 0; (drill_internal_i<vectorSize); drill_internal_i += 1) {
                    {
                        /** start SETUP for function sum **/ 
                        {
                            work0 .value = vv1 .getAccessor().get(drill_internal_i);
                            Float8Holder value = work0;
                            work4 .value = vv5 .getAccessor().get(drill_internal_i);
                            BigIntHolder nonNullCount = work4;
                             
SumFunctions$Float8Sum_setup: {
    value = new Float8Holder();
    nonNullCount = new BigIntHolder();
    nonNullCount.value = 0;
    value.value = 0;
}
 
                            work0 = value;
                            vv1 .getMutator().set(drill_internal_i, work0 .value);
                            work4 = nonNullCount;
                            vv5 .getMutator().set(drill_internal_i, work4 .value);
                        }
                        /** end SETUP for function sum **/ 
                    }
                }
                int[] fieldIds9 = new int[ 1 ] ;
                fieldIds9 [ 0 ] = 1;
                Object tmp10 = (incoming).getValueAccessorById(Float8Vector.class, fieldIds9).getValueVector();
                if (tmp10 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv8 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv8 = ((Float8Vector) tmp10);
                int[] fieldIds14 = new int[ 1 ] ;
                fieldIds14 [ 0 ] = 1;
                Object tmp15 = (outgoing).getValueAccessorById(NullableFloat8Vector.class, fieldIds14).getValueVector();
                if (tmp15 == null) {
                    throw new SchemaChangeException("Failure while loading vector vv13 with id: TypedFieldId [fieldIds=[1], remainder=null].");
                }
                vv13 = ((NullableFloat8Vector) tmp15);
            }
        }

        public void updateAggrValuesInternal(int incomingRowIdx, int htRowIdx)
            throws SchemaChangeException
        {
            {
                Float8Holder out11 = new Float8Holder();
                {
                    out11 .value = vv8 .getAccessor().get((incomingRowIdx));
                }
                Float8Holder in = out11;
                work0 .value = vv1 .getAccessor().get((htRowIdx));
                Float8Holder value = work0;
                work4 .value = vv5 .getAccessor().get((htRowIdx));
                BigIntHolder nonNullCount = work4;
                 
SumFunctions$Float8Sum_add: {
    nonNullCount.value = 1;
    value.value += in.value;
}
 
                work0 = value;
                vv1 .getMutator().set((htRowIdx), work0 .value);
                work4 = nonNullCount;
                vv5 .getMutator().set((htRowIdx), work4 .value);
            }
        }

        public void __DRILL_INIT__()
            throws SchemaChangeException
        {
        }

    }

}
