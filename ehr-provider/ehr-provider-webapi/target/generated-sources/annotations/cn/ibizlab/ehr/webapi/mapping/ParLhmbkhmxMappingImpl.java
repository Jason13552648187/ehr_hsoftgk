package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParLhmbkhmx;
import cn.ibizlab.ehr.webapi.dto.ParLhmbkhmxDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParLhmbkhmxMappingImpl implements ParLhmbkhmxMapping {

    @Override
    public ParLhmbkhmx toDomain(ParLhmbkhmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParLhmbkhmx parLhmbkhmx = new ParLhmbkhmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parLhmbkhmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parLhmbkhmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            parLhmbkhmx.setXh( dto.getXh() );
        }
        if ( dto.getFj() != null ) {
            parLhmbkhmx.setFj( dto.getFj() );
        }
        if ( dto.getWcbz() != null ) {
            parLhmbkhmx.setWcbz( dto.getWcbz() );
        }
        if ( dto.getBzfz() != null ) {
            parLhmbkhmx.setBzfz( dto.getBzfz() );
        }
        if ( dto.getKhbf() != null ) {
            parLhmbkhmx.setKhbf( dto.getKhbf() );
        }
        if ( dto.getJzyq() != null ) {
            parLhmbkhmx.setJzyq( dto.getJzyq() );
        }
        if ( dto.getParlhmbkhmxname() != null ) {
            parLhmbkhmx.setParlhmbkhmxname( dto.getParlhmbkhmxname() );
        }
        if ( dto.getLddf() != null ) {
            parLhmbkhmx.setLddf( dto.getLddf() );
        }
        if ( dto.getParndlhmbkhid() != null ) {
            parLhmbkhmx.setParndlhmbkhid( dto.getParndlhmbkhid() );
        }
        if ( dto.getUpdateman() != null ) {
            parLhmbkhmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parLhmbkhmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parLhmbkhmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParlhmbkhmxid() != null ) {
            parLhmbkhmx.setParlhmbkhmxid( dto.getParlhmbkhmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            parLhmbkhmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParndlhmbkhname() != null ) {
            parLhmbkhmx.setParndlhmbkhname( dto.getParndlhmbkhname() );
        }

        return parLhmbkhmx;
    }

    @Override
    public ParLhmbkhmxDTO toDto(ParLhmbkhmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParLhmbkhmxDTO parLhmbkhmxDTO = new ParLhmbkhmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parLhmbkhmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parLhmbkhmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            parLhmbkhmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getFj() != null ) {
            parLhmbkhmxDTO.setFj( entity.getFj() );
        }
        if ( entity.getWcbz() != null ) {
            parLhmbkhmxDTO.setWcbz( entity.getWcbz() );
        }
        if ( entity.getBzfz() != null ) {
            parLhmbkhmxDTO.setBzfz( entity.getBzfz() );
        }
        if ( entity.getKhbf() != null ) {
            parLhmbkhmxDTO.setKhbf( entity.getKhbf() );
        }
        if ( entity.getJzyq() != null ) {
            parLhmbkhmxDTO.setJzyq( entity.getJzyq() );
        }
        if ( entity.getParlhmbkhmxname() != null ) {
            parLhmbkhmxDTO.setParlhmbkhmxname( entity.getParlhmbkhmxname() );
        }
        if ( entity.getLddf() != null ) {
            parLhmbkhmxDTO.setLddf( entity.getLddf() );
        }
        if ( entity.getParndlhmbkhid() != null ) {
            parLhmbkhmxDTO.setParndlhmbkhid( entity.getParndlhmbkhid() );
        }
        if ( entity.getUpdateman() != null ) {
            parLhmbkhmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parLhmbkhmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parLhmbkhmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParlhmbkhmxid() != null ) {
            parLhmbkhmxDTO.setParlhmbkhmxid( entity.getParlhmbkhmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            parLhmbkhmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParndlhmbkhname() != null ) {
            parLhmbkhmxDTO.setParndlhmbkhname( entity.getParndlhmbkhname() );
        }

        return parLhmbkhmxDTO;
    }

    @Override
    public List<ParLhmbkhmx> toDomain(List<ParLhmbkhmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParLhmbkhmx> list = new ArrayList<ParLhmbkhmx>( dtoList.size() );
        for ( ParLhmbkhmxDTO parLhmbkhmxDTO : dtoList ) {
            list.add( toDomain( parLhmbkhmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParLhmbkhmxDTO> toDto(List<ParLhmbkhmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParLhmbkhmxDTO> list = new ArrayList<ParLhmbkhmxDTO>( entityList.size() );
        for ( ParLhmbkhmx parLhmbkhmx : entityList ) {
            list.add( toDto( parLhmbkhmx ) );
        }

        return list;
    }
}
