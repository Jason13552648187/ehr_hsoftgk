package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParNdlhmbkh;
import cn.ibizlab.ehr.webapi.dto.ParNdlhmbkhDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParNdlhmbkhMappingImpl implements ParNdlhmbkhMapping {

    @Override
    public ParNdlhmbkh toDomain(ParNdlhmbkhDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParNdlhmbkh parNdlhmbkh = new ParNdlhmbkh();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parNdlhmbkh.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parNdlhmbkh.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYgname() != null ) {
            parNdlhmbkh.setYgname( dto.getYgname() );
        }
        if ( dto.getNd() != null ) {
            parNdlhmbkh.setNd( dto.getNd() );
        }
        if ( dto.getJzsj() != null ) {
            parNdlhmbkh.setJzsj( dto.getJzsj() );
        }
        if ( dto.getZz() != null ) {
            parNdlhmbkh.setZz( dto.getZz() );
        }
        if ( dto.getBm() != null ) {
            parNdlhmbkh.setBm( dto.getBm() );
        }
        if ( dto.getZdf() != null ) {
            parNdlhmbkh.setZdf( dto.getZdf() );
        }
        if ( dto.getParndlhmbkhname() != null ) {
            parNdlhmbkh.setParndlhmbkhname( dto.getParndlhmbkhname() );
        }
        if ( dto.getYgid() != null ) {
            parNdlhmbkh.setYgid( dto.getYgid() );
        }
        if ( dto.getKhlx() != null ) {
            parNdlhmbkh.setKhlx( dto.getKhlx() );
        }
        if ( dto.getCreateman() != null ) {
            parNdlhmbkh.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parNdlhmbkh.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parNdlhmbkh.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParndlhmbkhid() != null ) {
            parNdlhmbkh.setParndlhmbkhid( dto.getParndlhmbkhid() );
        }
        if ( dto.getUpdateman() != null ) {
            parNdlhmbkh.setUpdateman( dto.getUpdateman() );
        }

        return parNdlhmbkh;
    }

    @Override
    public ParNdlhmbkhDTO toDto(ParNdlhmbkh entity) {
        if ( entity == null ) {
            return null;
        }

        ParNdlhmbkhDTO parNdlhmbkhDTO = new ParNdlhmbkhDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parNdlhmbkhDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parNdlhmbkhDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYgname() != null ) {
            parNdlhmbkhDTO.setYgname( entity.getYgname() );
        }
        if ( entity.getNd() != null ) {
            parNdlhmbkhDTO.setNd( entity.getNd() );
        }
        if ( entity.getJzsj() != null ) {
            parNdlhmbkhDTO.setJzsj( entity.getJzsj() );
        }
        if ( entity.getZz() != null ) {
            parNdlhmbkhDTO.setZz( entity.getZz() );
        }
        if ( entity.getBm() != null ) {
            parNdlhmbkhDTO.setBm( entity.getBm() );
        }
        if ( entity.getZdf() != null ) {
            parNdlhmbkhDTO.setZdf( entity.getZdf() );
        }
        if ( entity.getParndlhmbkhname() != null ) {
            parNdlhmbkhDTO.setParndlhmbkhname( entity.getParndlhmbkhname() );
        }
        if ( entity.getYgid() != null ) {
            parNdlhmbkhDTO.setYgid( entity.getYgid() );
        }
        if ( entity.getKhlx() != null ) {
            parNdlhmbkhDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getCreateman() != null ) {
            parNdlhmbkhDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parNdlhmbkhDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parNdlhmbkhDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParndlhmbkhid() != null ) {
            parNdlhmbkhDTO.setParndlhmbkhid( entity.getParndlhmbkhid() );
        }
        if ( entity.getUpdateman() != null ) {
            parNdlhmbkhDTO.setUpdateman( entity.getUpdateman() );
        }

        return parNdlhmbkhDTO;
    }

    @Override
    public List<ParNdlhmbkh> toDomain(List<ParNdlhmbkhDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParNdlhmbkh> list = new ArrayList<ParNdlhmbkh>( dtoList.size() );
        for ( ParNdlhmbkhDTO parNdlhmbkhDTO : dtoList ) {
            list.add( toDomain( parNdlhmbkhDTO ) );
        }

        return list;
    }

    @Override
    public List<ParNdlhmbkhDTO> toDto(List<ParNdlhmbkh> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParNdlhmbkhDTO> list = new ArrayList<ParNdlhmbkhDTO>( entityList.size() );
        for ( ParNdlhmbkh parNdlhmbkh : entityList ) {
            list.add( toDto( parNdlhmbkh ) );
        }

        return list;
    }
}
