package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.r7rt_dyna.domain.DynaChart;
import cn.ibizlab.ehr.webapi.dto.DynaChartDTO;
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
public class DynaChartMappingImpl implements DynaChartMapping {

    @Override
    public DynaChart toDomain(DynaChartDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DynaChart dynaChart = new DynaChart();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            dynaChart.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            dynaChart.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDynachartname() != null ) {
            dynaChart.setDynachartname( dto.getDynachartname() );
        }
        if ( dto.getModelid() != null ) {
            dynaChart.setModelid( dto.getModelid() );
        }
        if ( dto.getAppid() != null ) {
            dynaChart.setAppid( dto.getAppid() );
        }
        if ( dto.getModel() != null ) {
            dynaChart.setModel( dto.getModel() );
        }
        if ( dto.getUserid() != null ) {
            dynaChart.setUserid( dto.getUserid() );
        }
        if ( dto.getCreatedate() != null ) {
            dynaChart.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            dynaChart.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            dynaChart.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            dynaChart.setCreateman( dto.getCreateman() );
        }
        if ( dto.getDynachartid() != null ) {
            dynaChart.setDynachartid( dto.getDynachartid() );
        }

        return dynaChart;
    }

    @Override
    public DynaChartDTO toDto(DynaChart entity) {
        if ( entity == null ) {
            return null;
        }

        DynaChartDTO dynaChartDTO = new DynaChartDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            dynaChartDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            dynaChartDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDynachartname() != null ) {
            dynaChartDTO.setDynachartname( entity.getDynachartname() );
        }
        if ( entity.getModelid() != null ) {
            dynaChartDTO.setModelid( entity.getModelid() );
        }
        if ( entity.getAppid() != null ) {
            dynaChartDTO.setAppid( entity.getAppid() );
        }
        if ( entity.getModel() != null ) {
            dynaChartDTO.setModel( entity.getModel() );
        }
        if ( entity.getUserid() != null ) {
            dynaChartDTO.setUserid( entity.getUserid() );
        }
        if ( entity.getCreatedate() != null ) {
            dynaChartDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            dynaChartDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            dynaChartDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            dynaChartDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getDynachartid() != null ) {
            dynaChartDTO.setDynachartid( entity.getDynachartid() );
        }

        return dynaChartDTO;
    }

    @Override
    public List<DynaChart> toDomain(List<DynaChartDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DynaChart> list = new ArrayList<DynaChart>( dtoList.size() );
        for ( DynaChartDTO dynaChartDTO : dtoList ) {
            list.add( toDomain( dynaChartDTO ) );
        }

        return list;
    }

    @Override
    public List<DynaChartDTO> toDto(List<DynaChart> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DynaChartDTO> list = new ArrayList<DynaChartDTO>( entityList.size() );
        for ( DynaChart dynaChart : entityList ) {
            list.add( toDto( dynaChart ) );
        }

        return list;
    }
}
