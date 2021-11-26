package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSalaryBill;
import cn.ibizlab.ehr.webapi.dto.SalSalaryBillDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalSalaryBillMappingImpl implements SalSalaryBillMapping {

    @Override
    public SalSalaryBill toDomain(SalSalaryBillDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSalaryBill salSalaryBill = new SalSalaryBill();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSalaryBill.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSalaryBill.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSsou() != null ) {
            salSalaryBill.setSsou( dto.getSsou() );
        }
        if ( dto.getSalsalarybillname() != null ) {
            salSalaryBill.setSalsalarybillname( dto.getSalsalarybillname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            salSalaryBill.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            salSalaryBill.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getEnable() != null ) {
            salSalaryBill.setEnable( dto.getEnable() );
        }
        if ( dto.getSalsalarybillid() != null ) {
            salSalaryBill.setSalsalarybillid( dto.getSalsalarybillid() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSalaryBill.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            salSalaryBill.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            salSalaryBill.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            salSalaryBill.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            salSalaryBill.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmorgname() != null ) {
            salSalaryBill.setOrmorgname( dto.getOrmorgname() );
        }

        return salSalaryBill;
    }

    @Override
    public SalSalaryBillDTO toDto(SalSalaryBill entity) {
        if ( entity == null ) {
            return null;
        }

        SalSalaryBillDTO salSalaryBillDTO = new SalSalaryBillDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSalaryBillDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSalaryBillDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSsou() != null ) {
            salSalaryBillDTO.setSsou( entity.getSsou() );
        }
        if ( entity.getSalsalarybillname() != null ) {
            salSalaryBillDTO.setSalsalarybillname( entity.getSalsalarybillname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            salSalaryBillDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            salSalaryBillDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getEnable() != null ) {
            salSalaryBillDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSalsalarybillid() != null ) {
            salSalaryBillDTO.setSalsalarybillid( entity.getSalsalarybillid() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSalaryBillDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            salSalaryBillDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            salSalaryBillDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            salSalaryBillDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            salSalaryBillDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmorgname() != null ) {
            salSalaryBillDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return salSalaryBillDTO;
    }

    @Override
    public List<SalSalaryBill> toDomain(List<SalSalaryBillDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSalaryBill> list = new ArrayList<SalSalaryBill>( dtoList.size() );
        for ( SalSalaryBillDTO salSalaryBillDTO : dtoList ) {
            list.add( toDomain( salSalaryBillDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSalaryBillDTO> toDto(List<SalSalaryBill> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSalaryBillDTO> list = new ArrayList<SalSalaryBillDTO>( entityList.size() );
        for ( SalSalaryBill salSalaryBill : entityList ) {
            list.add( toDto( salSalaryBill ) );
        }

        return list;
    }
}
