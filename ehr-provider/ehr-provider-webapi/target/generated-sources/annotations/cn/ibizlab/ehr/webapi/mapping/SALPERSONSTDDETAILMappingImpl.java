package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SALPERSONSTDDETAIL;
import cn.ibizlab.ehr.webapi.dto.SALPERSONSTDDETAILDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SALPERSONSTDDETAILMappingImpl implements SALPERSONSTDDETAILMapping {

    @Override
    public SALPERSONSTDDETAIL toDomain(SALPERSONSTDDETAILDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SALPERSONSTDDETAIL sALPERSONSTDDETAIL = new SALPERSONSTDDETAIL();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            sALPERSONSTDDETAIL.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            sALPERSONSTDDETAIL.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYwz() != null ) {
            sALPERSONSTDDETAIL.setYwz( dto.getYwz() );
        }
        if ( dto.getXc() != null ) {
            sALPERSONSTDDETAIL.setXc( dto.getXc() );
        }
        if ( dto.getYwms() != null ) {
            sALPERSONSTDDETAIL.setYwms( dto.getYwms() );
        }
        if ( dto.getSalpersonstddetailname() != null ) {
            sALPERSONSTDDETAIL.setSalpersonstddetailname( dto.getSalpersonstddetailname() );
        }
        if ( dto.getSalpersonstdid() != null ) {
            sALPERSONSTDDETAIL.setSalpersonstdid( dto.getSalpersonstdid() );
        }
        if ( dto.getSalschemeitemid() != null ) {
            sALPERSONSTDDETAIL.setSalschemeitemid( dto.getSalschemeitemid() );
        }
        if ( dto.getCreatedate() != null ) {
            sALPERSONSTDDETAIL.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            sALPERSONSTDDETAIL.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            sALPERSONSTDDETAIL.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            sALPERSONSTDDETAIL.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalpersonstddetailid() != null ) {
            sALPERSONSTDDETAIL.setSalpersonstddetailid( dto.getSalpersonstddetailid() );
        }
        if ( dto.getUpdateman() != null ) {
            sALPERSONSTDDETAIL.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalpersonstdname() != null ) {
            sALPERSONSTDDETAIL.setSalpersonstdname( dto.getSalpersonstdname() );
        }
        if ( dto.getSalschemeitemname() != null ) {
            sALPERSONSTDDETAIL.setSalschemeitemname( dto.getSalschemeitemname() );
        }

        return sALPERSONSTDDETAIL;
    }

    @Override
    public SALPERSONSTDDETAILDTO toDto(SALPERSONSTDDETAIL entity) {
        if ( entity == null ) {
            return null;
        }

        SALPERSONSTDDETAILDTO sALPERSONSTDDETAILDTO = new SALPERSONSTDDETAILDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            sALPERSONSTDDETAILDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            sALPERSONSTDDETAILDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYwz() != null ) {
            sALPERSONSTDDETAILDTO.setYwz( entity.getYwz() );
        }
        if ( entity.getXc() != null ) {
            sALPERSONSTDDETAILDTO.setXc( entity.getXc() );
        }
        if ( entity.getYwms() != null ) {
            sALPERSONSTDDETAILDTO.setYwms( entity.getYwms() );
        }
        if ( entity.getSalpersonstddetailname() != null ) {
            sALPERSONSTDDETAILDTO.setSalpersonstddetailname( entity.getSalpersonstddetailname() );
        }
        if ( entity.getSalpersonstdid() != null ) {
            sALPERSONSTDDETAILDTO.setSalpersonstdid( entity.getSalpersonstdid() );
        }
        if ( entity.getSalschemeitemid() != null ) {
            sALPERSONSTDDETAILDTO.setSalschemeitemid( entity.getSalschemeitemid() );
        }
        if ( entity.getCreatedate() != null ) {
            sALPERSONSTDDETAILDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            sALPERSONSTDDETAILDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            sALPERSONSTDDETAILDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            sALPERSONSTDDETAILDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalpersonstddetailid() != null ) {
            sALPERSONSTDDETAILDTO.setSalpersonstddetailid( entity.getSalpersonstddetailid() );
        }
        if ( entity.getUpdateman() != null ) {
            sALPERSONSTDDETAILDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalpersonstdname() != null ) {
            sALPERSONSTDDETAILDTO.setSalpersonstdname( entity.getSalpersonstdname() );
        }
        if ( entity.getSalschemeitemname() != null ) {
            sALPERSONSTDDETAILDTO.setSalschemeitemname( entity.getSalschemeitemname() );
        }

        return sALPERSONSTDDETAILDTO;
    }

    @Override
    public List<SALPERSONSTDDETAIL> toDomain(List<SALPERSONSTDDETAILDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SALPERSONSTDDETAIL> list = new ArrayList<SALPERSONSTDDETAIL>( dtoList.size() );
        for ( SALPERSONSTDDETAILDTO sALPERSONSTDDETAILDTO : dtoList ) {
            list.add( toDomain( sALPERSONSTDDETAILDTO ) );
        }

        return list;
    }

    @Override
    public List<SALPERSONSTDDETAILDTO> toDto(List<SALPERSONSTDDETAIL> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SALPERSONSTDDETAILDTO> list = new ArrayList<SALPERSONSTDDETAILDTO>( entityList.size() );
        for ( SALPERSONSTDDETAIL sALPERSONSTDDETAIL : entityList ) {
            list.add( toDto( sALPERSONSTDDETAIL ) );
        }

        return list;
    }
}
