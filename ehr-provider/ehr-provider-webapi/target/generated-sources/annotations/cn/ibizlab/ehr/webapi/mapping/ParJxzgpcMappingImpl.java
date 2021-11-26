package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxzgpc;
import cn.ibizlab.ehr.webapi.dto.ParJxzgpcDTO;
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
public class ParJxzgpcMappingImpl implements ParJxzgpcMapping {

    @Override
    public ParJxzgpc toDomain(ParJxzgpcDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxzgpc parJxzgpc = new ParJxzgpc();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxzgpc.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxzgpc.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYgname() != null ) {
            parJxzgpc.setYgname( dto.getYgname() );
        }
        if ( dto.getPfld() != null ) {
            parJxzgpc.setPfld( dto.getPfld() );
        }
        if ( dto.getKhx() != null ) {
            parJxzgpc.setKhx( dto.getKhx() );
        }
        if ( dto.getKhlx() != null ) {
            parJxzgpc.setKhlx( dto.getKhlx() );
        }
        if ( dto.getSszzid() != null ) {
            parJxzgpc.setSszzid( dto.getSszzid() );
        }
        if ( dto.getSsbmid() != null ) {
            parJxzgpc.setSsbmid( dto.getSsbmid() );
        }
        if ( dto.getNd() != null ) {
            parJxzgpc.setNd( dto.getNd() );
        }
        if ( dto.getParjxzgpcname() != null ) {
            parJxzgpc.setParjxzgpcname( dto.getParjxzgpcname() );
        }
        if ( dto.getPfldid() != null ) {
            parJxzgpc.setPfldid( dto.getPfldid() );
        }
        if ( dto.getZdf() != null ) {
            parJxzgpc.setZdf( dto.getZdf() );
        }
        if ( dto.getSsbm() != null ) {
            parJxzgpc.setSsbm( dto.getSsbm() );
        }
        if ( dto.getYgid() != null ) {
            parJxzgpc.setYgid( dto.getYgid() );
        }
        if ( dto.getSszz() != null ) {
            parJxzgpc.setSszz( dto.getSszz() );
        }
        if ( dto.getParjxzgpcid() != null ) {
            parJxzgpc.setParjxzgpcid( dto.getParjxzgpcid() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxzgpc.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            parJxzgpc.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxzgpc.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxzgpc.setCreatedate( dto.getCreatedate() );
        }

        return parJxzgpc;
    }

    @Override
    public ParJxzgpcDTO toDto(ParJxzgpc entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxzgpcDTO parJxzgpcDTO = new ParJxzgpcDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxzgpcDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxzgpcDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYgname() != null ) {
            parJxzgpcDTO.setYgname( entity.getYgname() );
        }
        if ( entity.getPfld() != null ) {
            parJxzgpcDTO.setPfld( entity.getPfld() );
        }
        if ( entity.getKhx() != null ) {
            parJxzgpcDTO.setKhx( entity.getKhx() );
        }
        if ( entity.getKhlx() != null ) {
            parJxzgpcDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getSszzid() != null ) {
            parJxzgpcDTO.setSszzid( entity.getSszzid() );
        }
        if ( entity.getSsbmid() != null ) {
            parJxzgpcDTO.setSsbmid( entity.getSsbmid() );
        }
        if ( entity.getNd() != null ) {
            parJxzgpcDTO.setNd( entity.getNd() );
        }
        if ( entity.getParjxzgpcname() != null ) {
            parJxzgpcDTO.setParjxzgpcname( entity.getParjxzgpcname() );
        }
        if ( entity.getPfldid() != null ) {
            parJxzgpcDTO.setPfldid( entity.getPfldid() );
        }
        if ( entity.getZdf() != null ) {
            parJxzgpcDTO.setZdf( entity.getZdf() );
        }
        if ( entity.getSsbm() != null ) {
            parJxzgpcDTO.setSsbm( entity.getSsbm() );
        }
        if ( entity.getYgid() != null ) {
            parJxzgpcDTO.setYgid( entity.getYgid() );
        }
        if ( entity.getSszz() != null ) {
            parJxzgpcDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getParjxzgpcid() != null ) {
            parJxzgpcDTO.setParjxzgpcid( entity.getParjxzgpcid() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxzgpcDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            parJxzgpcDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxzgpcDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxzgpcDTO.setCreatedate( entity.getCreatedate() );
        }

        return parJxzgpcDTO;
    }

    @Override
    public List<ParJxzgpc> toDomain(List<ParJxzgpcDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxzgpc> list = new ArrayList<ParJxzgpc>( dtoList.size() );
        for ( ParJxzgpcDTO parJxzgpcDTO : dtoList ) {
            list.add( toDomain( parJxzgpcDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxzgpcDTO> toDto(List<ParJxzgpc> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxzgpcDTO> list = new ArrayList<ParJxzgpcDTO>( entityList.size() );
        for ( ParJxzgpc parJxzgpc : entityList ) {
            list.add( toDto( parJxzgpc ) );
        }

        return list;
    }
}
