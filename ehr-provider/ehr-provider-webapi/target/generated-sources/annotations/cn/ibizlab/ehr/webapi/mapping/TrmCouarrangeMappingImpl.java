package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmCouarrange;
import cn.ibizlab.ehr.webapi.dto.TrmCouarrangeDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmCouarrangeMappingImpl implements TrmCouarrangeMapping {

    @Override
    public TrmCouarrange toDomain(TrmCouarrangeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmCouarrange trmCouarrange = new TrmCouarrange();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmCouarrange.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmCouarrange.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPj() != null ) {
            trmCouarrange.setPj( dto.getPj() );
        }
        if ( dto.getCkzl() != null ) {
            trmCouarrange.setCkzl( dto.getCkzl() );
        }
        if ( dto.getSkksrq() != null ) {
            trmCouarrange.setSkksrq( dto.getSkksrq() );
        }
        if ( dto.getKcxs() != null ) {
            trmCouarrange.setKcxs( dto.getKcxs() );
        }
        if ( dto.getSkjssj() != null ) {
            trmCouarrange.setSkjssj( dto.getSkjssj() );
        }
        if ( dto.getTrmcouarrangename() != null ) {
            trmCouarrange.setTrmcouarrangename( dto.getTrmcouarrangename() );
        }
        if ( dto.getSkkssj() != null ) {
            trmCouarrange.setSkkssj( dto.getSkkssj() );
        }
        if ( dto.getYbzs() != null ) {
            trmCouarrange.setYbzs( dto.getYbzs() );
        }
        if ( dto.getKcnr() != null ) {
            trmCouarrange.setKcnr( dto.getKcnr() );
        }
        if ( dto.getTrmtrianpersonid() != null ) {
            trmCouarrange.setTrmtrianpersonid( dto.getTrmtrianpersonid() );
        }
        if ( dto.getTrmtrainteacherid() != null ) {
            trmCouarrange.setTrmtrainteacherid( dto.getTrmtrainteacherid() );
        }
        if ( dto.getTrmtrainfaciesid() != null ) {
            trmCouarrange.setTrmtrainfaciesid( dto.getTrmtrainfaciesid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmCouarrange.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            trmCouarrange.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getTrmtrainactapplyid() != null ) {
            trmCouarrange.setTrmtrainactapplyid( dto.getTrmtrainactapplyid() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmCouarrange.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getTrmagencyrecordid() != null ) {
            trmCouarrange.setTrmagencyrecordid( dto.getTrmagencyrecordid() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmCouarrange.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getTrmcoursesystemid() != null ) {
            trmCouarrange.setTrmcoursesystemid( dto.getTrmcoursesystemid() );
        }
        if ( dto.getTrmcouarrangeid() != null ) {
            trmCouarrange.setTrmcouarrangeid( dto.getTrmcouarrangeid() );
        }
        if ( dto.getCreateman() != null ) {
            trmCouarrange.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmCouarrange.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmCouarrange.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmCouarrange.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmCouarrange.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmCouarrange.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            trmCouarrange.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getTrmtrainactapplyname() != null ) {
            trmCouarrange.setTrmtrainactapplyname( dto.getTrmtrainactapplyname() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmCouarrange.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }
        if ( dto.getTrmtrianpersonname() != null ) {
            trmCouarrange.setTrmtrianpersonname( dto.getTrmtrianpersonname() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmCouarrange.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getTrmcoursesystemname() != null ) {
            trmCouarrange.setTrmcoursesystemname( dto.getTrmcoursesystemname() );
        }
        if ( dto.getTrmtrainfaciesname() != null ) {
            trmCouarrange.setTrmtrainfaciesname( dto.getTrmtrainfaciesname() );
        }
        if ( dto.getTrmtrainteachername() != null ) {
            trmCouarrange.setTrmtrainteachername( dto.getTrmtrainteachername() );
        }
        if ( dto.getTrmagencyrecordname() != null ) {
            trmCouarrange.setTrmagencyrecordname( dto.getTrmagencyrecordname() );
        }

        return trmCouarrange;
    }

    @Override
    public TrmCouarrangeDTO toDto(TrmCouarrange entity) {
        if ( entity == null ) {
            return null;
        }

        TrmCouarrangeDTO trmCouarrangeDTO = new TrmCouarrangeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmCouarrangeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmCouarrangeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPj() != null ) {
            trmCouarrangeDTO.setPj( entity.getPj() );
        }
        if ( entity.getCkzl() != null ) {
            trmCouarrangeDTO.setCkzl( entity.getCkzl() );
        }
        if ( entity.getSkksrq() != null ) {
            trmCouarrangeDTO.setSkksrq( entity.getSkksrq() );
        }
        if ( entity.getKcxs() != null ) {
            trmCouarrangeDTO.setKcxs( entity.getKcxs() );
        }
        if ( entity.getSkjssj() != null ) {
            trmCouarrangeDTO.setSkjssj( entity.getSkjssj() );
        }
        if ( entity.getTrmcouarrangename() != null ) {
            trmCouarrangeDTO.setTrmcouarrangename( entity.getTrmcouarrangename() );
        }
        if ( entity.getSkkssj() != null ) {
            trmCouarrangeDTO.setSkkssj( entity.getSkkssj() );
        }
        if ( entity.getYbzs() != null ) {
            trmCouarrangeDTO.setYbzs( entity.getYbzs() );
        }
        if ( entity.getKcnr() != null ) {
            trmCouarrangeDTO.setKcnr( entity.getKcnr() );
        }
        if ( entity.getTrmtrianpersonid() != null ) {
            trmCouarrangeDTO.setTrmtrianpersonid( entity.getTrmtrianpersonid() );
        }
        if ( entity.getTrmtrainteacherid() != null ) {
            trmCouarrangeDTO.setTrmtrainteacherid( entity.getTrmtrainteacherid() );
        }
        if ( entity.getTrmtrainfaciesid() != null ) {
            trmCouarrangeDTO.setTrmtrainfaciesid( entity.getTrmtrainfaciesid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmCouarrangeDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            trmCouarrangeDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getTrmtrainactapplyid() != null ) {
            trmCouarrangeDTO.setTrmtrainactapplyid( entity.getTrmtrainactapplyid() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmCouarrangeDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getTrmagencyrecordid() != null ) {
            trmCouarrangeDTO.setTrmagencyrecordid( entity.getTrmagencyrecordid() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmCouarrangeDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getTrmcoursesystemid() != null ) {
            trmCouarrangeDTO.setTrmcoursesystemid( entity.getTrmcoursesystemid() );
        }
        if ( entity.getTrmcouarrangeid() != null ) {
            trmCouarrangeDTO.setTrmcouarrangeid( entity.getTrmcouarrangeid() );
        }
        if ( entity.getCreateman() != null ) {
            trmCouarrangeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmCouarrangeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmCouarrangeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmCouarrangeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmCouarrangeDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmCouarrangeDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            trmCouarrangeDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getTrmtrainactapplyname() != null ) {
            trmCouarrangeDTO.setTrmtrainactapplyname( entity.getTrmtrainactapplyname() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmCouarrangeDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }
        if ( entity.getTrmtrianpersonname() != null ) {
            trmCouarrangeDTO.setTrmtrianpersonname( entity.getTrmtrianpersonname() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmCouarrangeDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getTrmcoursesystemname() != null ) {
            trmCouarrangeDTO.setTrmcoursesystemname( entity.getTrmcoursesystemname() );
        }
        if ( entity.getTrmtrainfaciesname() != null ) {
            trmCouarrangeDTO.setTrmtrainfaciesname( entity.getTrmtrainfaciesname() );
        }
        if ( entity.getTrmtrainteachername() != null ) {
            trmCouarrangeDTO.setTrmtrainteachername( entity.getTrmtrainteachername() );
        }
        if ( entity.getTrmagencyrecordname() != null ) {
            trmCouarrangeDTO.setTrmagencyrecordname( entity.getTrmagencyrecordname() );
        }

        return trmCouarrangeDTO;
    }

    @Override
    public List<TrmCouarrange> toDomain(List<TrmCouarrangeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmCouarrange> list = new ArrayList<TrmCouarrange>( dtoList.size() );
        for ( TrmCouarrangeDTO trmCouarrangeDTO : dtoList ) {
            list.add( toDomain( trmCouarrangeDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmCouarrangeDTO> toDto(List<TrmCouarrange> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmCouarrangeDTO> list = new ArrayList<TrmCouarrangeDTO>( entityList.size() );
        for ( TrmCouarrange trmCouarrange : entityList ) {
            list.add( toDto( trmCouarrange ) );
        }

        return list;
    }
}
